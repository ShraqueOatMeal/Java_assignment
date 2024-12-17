package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class User {
  private String userId;
  private String username;
  private String email;
  private String password;
  private UserType userType;

  // Static map to store all registered users
  private static Map<String, User> registeredUsers = new HashMap<>();

  // Email pattern for validation
  private static final Pattern EMAIL_PATTERN = Pattern.compile(
      "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");

  // Constructor
  public User() {
  }

  public User(String userId, String username, String email, String password, UserType userType) {
    this.userId = userId;
    this.username = username;
    this.email = email;
    this.password = password;
    this.userType = userType;
  }

  // Getters and setters
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  // methods
  public boolean login(String email, String password) {

    // Get user from map
    User user = registeredUsers.get(email);

    if (user == null) {
      return false;
    }

    // Validate password
    if (!user.password.equals(password)) {
      return false;
    }

    // Set user type
    this.userType = user.userType;

    // Set user access level
    this.userType.setAccessLevel(user.userType.getAccessLevel());

    // Set user department
    this.userType.setDepartment(user.userType.getDepartment());

    // Return true if login is successful
    return user.getUserType().validateAccess();
  }

  public void logout() {
    Session.getInstance().clearSession();
    Login loginFrame = new Login();
    loginFrame.setVisible(true);
    loginFrame.pack();
    loginFrame.setLocationRelativeTo(null);
  }
}
