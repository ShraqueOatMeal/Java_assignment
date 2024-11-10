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
}
