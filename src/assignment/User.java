package assignment;

public class User {
  private String userId;
  private String username;
  private String email;
  private String password;

  // Constructor
  public User() {
  }

  public User(String userId, String username, String email, String password) {
    this.userId = userId;
    this.username = username;
    this.email = email;
    this.password = password;
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

  // methods
  public void login() {
    // TODO: implement login
  }

  public void logout() {
    // TODO: implement logout
  }

  public void register() {
    // TODO: implement register
  }

  public void changePassword() {
    // TODO: implement change password
  }

  public void updateProfile() {
    // TODO: implement update
  }
}
