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

    // Set user permissions
    this.userType.setPermissions(user.userType.getPermissions());

    // Return true if login is successful
    return user.getUserType().validateAcess();
  }

  public void logout() {
    // TODO: implement logout
  }

  public void register() {

    // Validate fields
    if (/* username == null || username.trim().isEmpty() || */ email == null || email.trim().isEmpty()
        || password == null
        || password.trim().isEmpty()) {
      throw new IllegalArgumentException("All fields must be filled");
    }

    // Validate email format
    if (!EMAIL_PATTERN.matcher(email).matches()) {
      throw new IllegalArgumentException("Invalid email format");
    }

    // Validate password format
    if (!password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}")) {
      throw new IllegalArgumentException(
          "Password must contain at least one uppercase letter, one lowercase letter, one number and one special character");
    }

    // Check if user already exists
    if (registeredUsers.containsKey(email)) {
      throw new IllegalArgumentException("Email already exists");
    }

    // Generate userId
    this.userId = String.valueOf(System.currentTimeMillis());

    // Add user to map
    registeredUsers.put(email, this);
  }

  public void changePassword(String oldPassword, String newPassword) throws IllegalArgumentException {
    // Verify old password
    if (!this.password.equals(oldPassword)) {
      throw new IllegalArgumentException("Old password is incorrect");
    }

    // Validate new password
    if (!newPassword.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}")) {
      throw new IllegalArgumentException(
          "Password must contain at least one uppercase letter, one lowercase letter, one number and one special character");
    }

    // Update password
    this.password = newPassword;
  }

  public void updateProfile(String newUsername, String newEmail) throws IllegalArgumentException {
    // Validate new email if it is differnt
    if (!newEmail.equals(this.email)) {
      // Validate new email format
      if (!EMAIL_PATTERN.matcher(newEmail).matches()) {
        throw new IllegalArgumentException("Invalid email format");
      }

      // Check if new email already exists
      if (registeredUsers.containsKey(newEmail) && !newEmail.equals(this.email)) {
        throw new IllegalArgumentException("New email already exists");
      }
    }
    // Update the user information
    registeredUsers.remove(this.email); // Remove old email from map
    this.username = newUsername;
    this.email = newEmail;
    registeredUsers.put(this.email, this); // Add new email to map
  }
}
