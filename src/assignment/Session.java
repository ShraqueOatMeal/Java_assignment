package assignment;

public class Session {
  private static Session instance;
  private String userID;
  private String username;
  private UserType userType;
  private int accessLevel;

  private Session() {
  }

  public static Session getInstance() {
    if (instance == null) {
      instance = new Session();
    }
    return instance;
  }

  public void setSessionData(String userID, String username, UserType userType, int accessLevel) {
    this.userID = userID;
    this.username = username;
    this.userType = userType;
    this.accessLevel = accessLevel;
  }

  public void clearSession() {
    this.username = null;
    this.userType = null;
    this.accessLevel = 0;
  }

  public String getUsername() {
    return username;
  }

  public UserType getUserType() {
    return userType;
  }

  public int getAccessLevel() {
    return accessLevel;
  }
}
