package assignment.PurchaseManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;

public class PurchaseManager extends UserType {
  private double purchaseLimit;
  private double approvalThreshold;
  private FileHandler fileHandler;
  // private List<Supplier> assignedSuppliers;

  public PurchaseManager() {
    super();
    this.accessLevel = 2;
    this.department = "Purchase";
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_PURCHASE");
    permissions.add("CREATE_ORDER");
    permissions.add("APPROVE_PURCHASE");
  }

  public void viewItems() {
    // Implementation
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

  public void approvePurchaseOrder() {
    // Implementation
  }
}
