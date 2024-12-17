package assignment.PurchaseManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;

public class PurchaseManager extends UserType {
  private double purchaseLimit;
  private double approvalThreshold;
  private FileHandler fileHandler;
  private FileHandler purchOrderHandler;
  private String username;
  // private List<Supplier> assignedSuppliers;

  public PurchaseManager() {
    super();
    this.accessLevel = 2;
    this.department = "Purchase";
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
    this.purchOrderHandler = new FileHandler("src/assignment/database/purchOrder.txt");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public List<String[]> checkStockLevel() {
    FileHandler stockFile = new FileHandler("src/assignment/database/stock.txt");
    List<String[]> stockList = stockFile.readData();

    return stockList;
  }

  public void viewSuppliers() {
    // Implementation
  }

  public void createPurchaseOrder() {
    // Implementation
  }

  public List<String[]> viewRequisitions() {
    return fileHandler.readData();
  }

  public void createRequisition(String itemName, int quantity, String userId, String date, String itemId,
      String supId, String price) {
    int newRequisitionID = purchOrderHandler.getLastId() + 1;
    String status = "Approved";
    String[] record = { String.valueOf(newRequisitionID), itemName, String.valueOf(quantity), status,
        userId, date, itemId, supId, price };
    purchOrderHandler.addRecord(record);
  }

  public List<String[]> viewPurchaseOrder() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
    purchOrderHandler.saveAllRecords();
  }
}
