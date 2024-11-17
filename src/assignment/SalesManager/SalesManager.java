package assignment.SalesManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;

public class SalesManager extends UserType {
  private FileHandler fileHandler;
  private String username;
  private String userId;
  private String date;

  public SalesManager() {
    super();
    this.accessLevel = 3;
    this.department = "Sales";
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("Create Requisition");
    permissions.add("View Items");
    permissions.add("Enter Daily Sales");
    permissions.add("Generate Sales Report");
    permissions.add("Check Stock Level");
    permissions.add("View Purchase Orders");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return userId;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate() {
    return date;
  }

  public void createRequisition(String itemName, int quantity, String username, String userId, String date) {
    int newRequisitionID = fileHandler.getLastId() + 1;
    String status = "Pending";
    String[] record = { String.valueOf(newRequisitionID), itemName, String.valueOf(quantity), status, username,
        userId, date };
    fileHandler.addRecord(record);
  }

  public List<String[]> viewPurchaseOrder() {
    return fileHandler.readData();
  }

  public void viewItems() {
    // Implementation
  }

  public void enterDailySales() {
    // Implementation
  }

  public void generateSalesReport() {
    // Implementation
  }

  public List<String[]> checkStockLevel() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/stock.txt");
    return fileHandler.readData();
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
  }
}
