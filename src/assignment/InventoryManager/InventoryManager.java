package assignment.InventoryManager;

import assignment.UserType;

public class InventoryManager extends UserType {
  public InventoryManager() {
    super();
    this.accessLevel = 5;
    this.department = "Inventory";
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_INVENTORY");
    permissions.add("EDIT_INVENTORY");
    permissions.add("MANAGE_STOCK");
  }
}
