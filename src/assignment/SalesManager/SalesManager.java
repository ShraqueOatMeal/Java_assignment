package assignment.SalesManager;

import assignment.UserType;

public class SalesManager extends UserType {
  public SalesManager() {
    super();
    this.accessLevel = 3;
    this.department = "Sales";
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

  public void createRequisition() {
    // Implementation
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

  public void viewPurchaseOrders() {
    // Implementation
  }
}
