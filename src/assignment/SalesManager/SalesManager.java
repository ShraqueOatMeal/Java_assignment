package assignment.SalesManager;

import assignment.UserType;
import assignment.FileHandler;
import assignment.SalesReportPreview;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesManager extends UserType {
  private FileHandler fileHandler;
  private String username;
  private String userId;
  private String date;
  private List<Requisition> requisitions;

  public SalesManager() {
    super();
    this.accessLevel = 3;
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
    this.requisitions = loadRequisitions();
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate() {
    return date;
  }

  public void createRequisition(String itemName, int quantity, String userId, String date, String itemId,
      String supId, String price) {
    Requisition newRequisition = new Requisition(itemName, itemId, supId, userId, quantity, date, price);
    requisitions.add(newRequisition);
    fileHandler.addRecord(newRequisition.toArray());
  }

  public List<Requisition> loadRequisitions() {
    List<String[]> records = fileHandler.readData();
    List<Requisition> requisitions = new ArrayList<>();
    return requisitions;
  }

  public List<String[]> viewPurchaseOrder() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public List<String[]> checkStockLevel() {
    FileHandler stockFile = new FileHandler("src/assignment/database/stock.txt");
    List<String[]> stockList = stockFile.readData();

    return stockList;
  }

  public void showBelowStockLevel(JFrame frame, JToggleButton belowThresholdButton, JTable jTable1) {
    FileHandler stockFile = new FileHandler("src/assignment/database/stock.txt");
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    if (belowThresholdButton.isSelected()) {
      belowThresholdButton.setText("Show All");
      model.setRowCount(0); // Clear existing rows
      List<String[]> lines = stockFile.readData();

      for (String[] data : lines) {
        if (data.length >= 4) {
          try {
            int quantity = Integer.parseInt(data[2].trim());
            int threshold = Integer.parseInt(data[3].trim());

            if (quantity < threshold) {
              model.addRow(new Object[] {
                  data[0].trim(), // Item ID
                  data[1].trim(), // Item Name
                  data[2].trim(), // Item Quantity
                  data[3].trim() // Restock Level
              });
            }
          } catch (NumberFormatException e) {
            // Skip invalid number formats
            continue;
          }
        }
      }

      if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(frame,
            "No items are currently below their restock level",
            "Stock Status",
            JOptionPane.INFORMATION_MESSAGE);
        belowThresholdButton.setSelected(false);
      }
    } else {
      belowThresholdButton.setText("Below Threshold");
      loadTable(jTable1);
    }
  }

  public void loadTable(JTable jTable1) {
    List<String[]> stockData = checkStockLevel();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    for (String[] row : stockData) {
      model.addRow(row);
    }
  }

  public void loadPurchaseOrders(JTable jTable2) {
    List<String[]> requisitionData = viewPurchaseOrder();

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);

    for (String[] row : requisitionData) {
      model.addRow(row);
    }
  }

  public void comboBoxAddBelowReorderLevel(JComboBox<String> comboBox) {
    FileHandler stock = new FileHandler("src/assignment/database/stock.txt");

    List<String[]> stocks = stock.readData();

    for (String[] stockData : stocks) {
      String stockID = stockData[0];
      int quantity = Integer.parseInt(stockData[2]);
      int reorderLevel = Integer.parseInt(stockData[3]);

      // Check if quantity is below reorder level
      if (quantity < reorderLevel) {
        String itemName = stockData[1];
        comboBox.addItem(itemName);
      }
    }

  }

  public void loadSuppliers(JComboBox<String> jComboBox1, JComboBox<String> supplierCombo) {
    FileHandler supplier = new FileHandler("src/assignment/database/suppliers.txt");
    FileHandler bridge = new FileHandler("src/assignment/database/bridge.txt");
    FileHandler stock = new FileHandler("src/assignment/database/stock.txt");

    List<String[]> suppliers = supplier.readData();
    List<String[]> bridges = bridge.readData();
    List<String[]> stocks = stock.readData();

    String selectedItemName = (String) jComboBox1.getSelectedItem();
    supplierCombo.removeAllItems(); // Clear existing items

    // First find the stockID for the selected item name
    String stockID = "";
    for (String[] stockData : stocks) {
      if (stockData[1].equals(selectedItemName)) {
        stockID = stockData[0];
        break;
      }
    }

    // Find all supplierIDs from bridge table that match the stockID
    Map<String, String> supplierPrices = new HashMap<>();
    for (String[] bridgeData : bridges) {
      if (bridgeData[0].equals(stockID)) {
        String supplierID = bridgeData[1]; // bridge[1] contains supplierID
        String price = bridgeData[2]; // bridge[2] contains price

        for (String[] supplierData : suppliers) {
          if (supplierData[0].equals(supplierID)) {
            String displayText = supplierData[1] + "- $" + price;
            supplierPrices.put(supplierID, displayText);
          }
        }
      }
    }

    for (String displayText : supplierPrices.values()) {
      supplierCombo.addItem(displayText);
    }

  }

  public void generateReport(JFrame frame, String selectedDate, String salesPerson, DefaultTableModel tableModel) {
    SalesReportPreview preview = new SalesReportPreview(frame, selectedDate, salesPerson, tableModel);
    preview.setVisible(true);
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
  }
}
