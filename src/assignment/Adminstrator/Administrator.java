package assignment.Adminstrator;

import assignment.UserType;

public class Administrator extends UserType {
  public Administrator() {
    super();
    this.accessLevel = 1;
    this.department = "Administrator";
  }

  @Override
  protected void initializePermissions() {
    permissions.add("ALL");
  }
}
