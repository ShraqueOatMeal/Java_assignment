package assignment.PurchaseManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;

public class PurchaseManager extends UserType {
  private double purchaseLimit;
  private double approvalThreshold;
  private FileHandler fileHandler;
  private String username;
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

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
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

  public void createRequisition(String itemName, int quantity, String userId, String date, String itemId,
      String supId) {
    int newRequisitionID = fileHandler.getLastId() + 1;
    String status = "Approved";
    String[] record = { String.valueOf(newRequisitionID), itemName, String.valueOf(quantity), status,
        userId, date, itemId, supId };
    fileHandler.addRecord(record);
  }

  public void approvePurchaseOrder() {
    // Implementation
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
  }
}
