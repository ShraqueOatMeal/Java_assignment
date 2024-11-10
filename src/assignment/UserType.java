package assignment;

import java.util.List;
import java.util.ArrayList;

public abstract class UserType {
  protected int accessLevel;
  protected String department;
  protected List<String> permissions;

  public UserType() {
    permissions = new ArrayList<>();
    initializePermissions();
  }

  protected abstract void initializePermissions();

  // Setters and getters
  public int getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(int accessLevel) {
    this.accessLevel = accessLevel;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  // Methods
  public boolean hasPermission(String permission) {
    return permissions.contains(permission);
  }

  public void getDashboard() {
    // TODO: implement
  }

  public void getMenuItems() {
    // TODO: implement
  }

  public boolean validateAcess() {
    return accessLevel > 0 && !permissions.isEmpty();
  }
}
