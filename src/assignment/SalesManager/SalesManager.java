package assignment.SalesManager;

import assignment.UserType;
import assignment.FileHandler;

public class SalesManager extends UserType {
  private FileHandler fileHandler;

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

  public void createRequisition(String itemName, int quantity) {
    int newRequisitionID = fileHandler.getLastId() + 1;
    String status = "Pending";
    fileHandler.addRecord(newRequisitionID, itemName, String.valueOf(quantity), status);
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

  public void checkStockLevel() {
    // Implementation
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
  }
}
