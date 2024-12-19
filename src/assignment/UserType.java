package assignment;

import java.util.List;
import java.util.ArrayList;

public abstract class UserType extends User {
  protected int accessLevel;
  protected List<String> permissions;
  protected User user;

  public UserType() {
  }

  // Setters and getters
  public int getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(int accessLevel) {
    this.accessLevel = accessLevel;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public boolean validateAccess() {
    return accessLevel > 0 && !permissions.isEmpty();
  }
}
