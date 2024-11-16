package assignment.FinanceManager;

import java.util.List;

import assignment.UserType;

public class FinanceManager extends UserType {
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

public List<String[]> checkStockStatus() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'checkStockStatus'");
}
}
