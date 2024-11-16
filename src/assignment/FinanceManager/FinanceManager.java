package assignment.FinanceManager;

import assignment.UserType;

public class FinanceManager extends UserType {
  private String username;

  public FinanceManager() {
    super();
    this.accessLevel = 4;
    this.department = "Finance";
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_FINANCE");
    permissions.add("EDIT_FINANCE");
    permissions.add("GENERATE_REPORTS");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }
}
