package assignment.InventoryManager;

import assignment.UserType;
import java.util.List;

import javax.swing.JOptionPane;

import assignment.FileHandler;

public class InventoryManager extends UserType {
  private String username;
  private FileHandler fileHandler;
  private FileHandler supplierFileHandler;

  public InventoryManager() {
    super();
    this.accessLevel = 5;
    this.department = "Inventory";
    this.fileHandler = new FileHandler("src/assignment/database/stock.txt");
    this.supplierFileHandler = new FileHandler("src/assignment/database/supplier.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_INVENTORY");
    permissions.add("EDIT_INVENTORY");
    permissions.add("MANAGE_STOCK");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public List<String[]> trackInventoryValue() {
    return fileHandler.readData();
  }

  public List<String[]> updateStockLevels() {
    return fileHandler.readData();
  }

  public boolean addItem(String itemName, int itemStatus, int itemPrice, int itemQuantity) {
    try {
      // Check If item name already Exists
      List<String[]> items = fileHandler.readData();
      for (String[] item : items) {
        if (item[1].equals(itemName)) {
          JOptionPane.showMessageDialog(null,
              "Item Name Already Exists",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      String record = String.format("%s,%s,%s,%s", itemName, itemStatus, itemPrice, itemQuantity);
      fileHandler.addRecord(items.size() + 1, record);
      fileHandler.saveAllRecords();

      JOptionPane.showMessageDialog(null,
          "Item Added Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Adding Item",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean removeItem(String itemName) {
    try {
      List<String[]> items = fileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean itemFound = false;
      for (String[] item : items) {
        if (!item[1].equals(itemName)) {
          updatedRecords.add(String.join(",", item));
        } else {
          itemFound = true;
        }
      }
      if (!itemFound) {
        JOptionPane.showMessageDialog(null,
            "Item Not Found",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }
      fileHandler = new FileHandler("src/assignment/database/stock.txt");
      fileHandler.clearFileContents();

      fileHandler.writeRecords(updatedRecords);

      JOptionPane.showMessageDialog(null,
          "Item Removed Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Removing Item",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean updateItem(String itemID, String itemName, int itemStatus, int itemPrice, int itemQuantity) {
    try {
      // Check If item name already Exists
      List<String[]> items = fileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean itemFound = false;

      for (String[] item : items) {
        if (item[1].equals(itemName)) {
          // Update item information
          String updatedRecord = String.format("%s,%s,%s,%s,%s", itemID, itemName, itemStatus, itemPrice, itemQuantity);
          updatedRecords.add(updatedRecord);
          itemFound = true;
        } else {
          updatedRecords.add(String.join(",", item));
        }
      }

      if (!itemFound) {
        JOptionPane.showMessageDialog(null,
            "Item Not Found",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }

      // Create new FileHandler instance and save updated records
      fileHandler = new FileHandler("src/assignment/database/stock.txt");
      fileHandler.clearFileContents();
      fileHandler.writeRecords(updatedRecords);

      JOptionPane.showMessageDialog(null,
          "Item Updated Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Updating Item",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean addSupplier(String supplierID, String supplierName, String supplierItemID) {
    try {
      // Check If item name already Exists
      List<String[]> suppliers = supplierFileHandler.readData();
      for (String[] supplier : suppliers) {
        if (supplier[1].equals(supplierName)) {
          JOptionPane.showMessageDialog(null,
              "Supplier Name Already Exists",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      String record = String.format("%s,%s,%s", supplierID, supplierName, supplierItemID);
      supplierFileHandler.addRecord(suppliers.size() + 1, record);
      supplierFileHandler.saveAllRecords();

      JOptionPane.showMessageDialog(null,
          "Supplier Added Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Adding Supplier",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean removeSupplier(String supplierID) {
    try {
      List<String[]> suppliers = supplierFileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean supplierFound = false;
      for (String[] supplier : suppliers) {
        if (!supplier[1].equals(supplierID)) {
          updatedRecords.add(String.join(",", supplier));
        } else {
          supplierFound = true;
        }
      }
      if (!supplierFound) {
        JOptionPane.showMessageDialog(null,
            "Supplier Not Found",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }
      supplierFileHandler = new FileHandler("src/assignment/database/supplier.txt");
      supplierFileHandler.clearFileContents();

      supplierFileHandler.writeRecords(updatedRecords);

      JOptionPane.showMessageDialog(null,
          "Supplier Removed Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Removing Supplier",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean updateSupplier(String supplierID, String supplierName, String supplierItemID) {
    try {
      // Check If item name already Exists
      List<String[]> suppliers = supplierFileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean supplierFound = false;

      for (String[] supplier : suppliers) {
        if (supplier[1].equals(supplierName)) {
          // Update item information
          String updatedRecord = String.format("%s,%s,%s", supplierID, supplierName, supplierItemID);
          updatedRecords.add(updatedRecord);
          supplierFound = true;
        } else {
          updatedRecords.add(String.join(",", supplier));
        }
      }

      if (!supplierFound) {
        JOptionPane.showMessageDialog(null,
            "Supplier Not Found",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }

      // Create new FileHandler instance and save updated records
      supplierFileHandler = new FileHandler("src/assignment/database/supplier.txt");
      supplierFileHandler.clearFileContents();
      supplierFileHandler.writeRecords(updatedRecords);

      JOptionPane.showMessageDialog(null,
          "Supplier Updated Successfully",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error Updating Supplier",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  // Implementation
  public List<String[]> manageSuppliers() {
    return supplierFileHandler.readData();
  }
}
