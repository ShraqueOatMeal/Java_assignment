package assignment.InventoryManager;

import assignment.UserType;

public class InventoryManager extends UserType {
  private String username;

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

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }
}
