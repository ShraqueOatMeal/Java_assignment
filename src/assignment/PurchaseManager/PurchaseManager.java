package assignment.PurchaseManager;

import assignment.UserType;
import java.util.List;

public class PurchaseManager extends UserType {
  private double purchaseLimit;
  private double approvalThreshold;
  // private List<Supplier> assignedSuppliers;

  public PurchaseManager() {
    super();
    this.accessLevel = 2;
    this.department = "Purchase";
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

  public void viewRequisitions() {
    // Implementation
  }

  public void approvePurchaseOrder() {
    // Implementation
  }
}
