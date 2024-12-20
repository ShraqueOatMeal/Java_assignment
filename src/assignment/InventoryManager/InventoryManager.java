package assignment.InventoryManager;

import assignment.UserType;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import assignment.FileHandler;

public class InventoryManager extends UserType {
  private String username;
  private FileHandler fileHandler;
  private FileHandler supplierFileHandler;
  private FileHandler bridgeFileHandler;

  public InventoryManager() {
    super();
    this.accessLevel = 5;
    this.department = "Inventory";
    this.fileHandler = new FileHandler("src/assignment/database/stock.txt");
    this.supplierFileHandler = new FileHandler("src/assignment/database/suppliers.txt");
    this.bridgeFileHandler = new FileHandler("src/assignment/database/bridge.txt");
  }

  public List<String[]> trackInventoryValue() {
    return fileHandler.readData();
  }

  public List<String[]> updateStockLevels() {
    return fileHandler.readData();
  }

  public boolean addItem(String itemID, String itemName, int threshold, int itemPrice, int itemQuantity) {
    try {
      // Check if item ID already exists in the records
      List<String[]> items = fileHandler.readData();
      for (String[] item : items) {
        if (item[0].equals(itemID)) {
          JOptionPane.showMessageDialog(null,
              "Item ID Already Exists",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      // Generate the record with the user-provided itemID (no increment here)
      String record = String.format("%s,%s,%d,%d,%d", itemID, itemName, itemQuantity, threshold, itemPrice);

      // Directly use the user-provided itemID without the increment logic
      // Here we pass the record as-is without affecting the itemID
      fileHandler.addRecord(record); // Just add the record as it is
      fileHandler.saveAllRecords(); // Save the records to the file

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

  public boolean removeItem(String itemID) {
    try {
      List<String[]> items = fileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean itemFound = false;
      for (String[] item : items) {
        if (!item[0].equals(itemID)) {
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

  public boolean updateItem(String itemID, String itemName, int threshold, int itemPrice, int itemQuantity) {
    try {
      // Check If item name already Exists
      List<String[]> items = fileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean itemFound = false;

      for (String[] item : items) {
        if (item[0].equals(itemID)) {
          // Update item information
          String updatedRecord = String.format("%s,%s,%s,%s,%s", itemID, itemName, itemQuantity, threshold, itemPrice);
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

  public boolean updateQuantity(String itemID, String itemQuantity) {
    try {
      // Check If item name already Exists
      List<String[]> items = fileHandler.readData();
      List<String> updatedRecords = new java.util.ArrayList<>();
      boolean itemFound = false;

      for (String[] item : items) {
        if (item[0].equals(itemID)) {
          // Update item information
          String updatedRecord = String.format("%s,%s,%s,%s,%s", item[0], item[1], itemQuantity, item[3], item[4]);
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

  public boolean addSupplier(String supplierID, String supplierName, String supplierItemID, String address,
      String price) {
    try {
      // Check If item name already Exists
      List<String[]> suppliers = supplierFileHandler.readData();
      for (String[] supplier : suppliers) {
        if (supplier[0].equals(supplierID)) {
          JOptionPane.showMessageDialog(null,
              "Supplier ID Already Exists",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      String record = String.format("%s,%s,%s", supplierID, supplierName, address);
      supplierFileHandler.addRecord(record);
      supplierFileHandler.saveAllRecords();

      String bridgeRecord = String.format("%s,%s,%s", supplierItemID, supplierID, price);
      bridgeFileHandler.addRecord(bridgeRecord);
      bridgeFileHandler.saveAllRecords();

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
        if (!supplier[0].equals(supplierID)) {
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
      supplierFileHandler = new FileHandler("src/assignment/database/suppliers.txt");
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

  public boolean updateSupplier(String supplierID, String newSupplierName, String newSupplierItemID, String newAddress,
      String newPrice) {
    try {
      // Check If item name already Exists
      List<String[]> suppliers = supplierFileHandler.readData();
      List<String[]> bridge = bridgeFileHandler.readData();
      boolean supplierFound = false;

      for (int i = 0; i < suppliers.size(); i++) {
        if (suppliers.get(i)[0].equals(supplierID)) {
          suppliers.get(i)[1] = newSupplierName;
          suppliers.get(i)[2] = newAddress;
          supplierFound = true;
          break;
        }
      }

      if (!supplierFound) { // If supplier not found, return false
        JOptionPane.showMessageDialog(null, "Supplier Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
      }

      boolean bridgeUpdated = false;
      for (int i = 0; i < bridge.size(); i++) {
        if (bridge.get(i)[1].equals(supplierID)) {
          bridge.get(i)[0] = newSupplierItemID;
          bridge.get(i)[2] = newPrice;
          bridgeUpdated = true;
          break;
        }
      }

      if (!bridgeUpdated) {
        String[] newBridgeRecord = { newSupplierItemID, supplierID, newPrice };
        bridge.add(newBridgeRecord);
      }

      // Convert arrays back to comma-separated strings
      List<String> supplierRecords = suppliers.stream().map(arr -> String.join(",", arr)).collect(Collectors.toList());

      List<String> bridgeRecords = bridge.stream().map(arr -> String.join(",", arr)).collect(Collectors.toList());

      supplierFileHandler.clearFileContents();
      supplierFileHandler.writeRecords(supplierRecords);

      bridgeFileHandler.clearFileContents();
      bridgeFileHandler.writeRecords(bridgeRecords);

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
