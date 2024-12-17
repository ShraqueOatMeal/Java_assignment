package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.util.List;
import assignment.Adminstrator.Administrator;
import assignment.Adminstrator.adminstratorPage;
import assignment.PurchaseManager.PurchaseManager;
import assignment.PurchaseManager.purchaseManagerPage;
import assignment.SalesManager.SalesManager;
import assignment.SalesManager.salesManagerPage;
import assignment.FinanceManager.FinanceManager;
import assignment.FinanceManager.financeManagerPage;
import assignment.InventoryManager.InventoryManager;
import assignment.InventoryManager.inventoryManagerPage;
import assignment.Session;

public class User {
  private String userId;
  private String username;
  private String email;
  private String password;
  private UserType userType;

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
  public void login(Session session, JFrame frame, JPasswordField passwordField, String email, String password) {
    if (email.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(frame, "Please enter both email and password");
      return;
    }

    UserType user = authenticate(email, password);
    if (user != null) {

      // Set session data
      session.setSessionData(user.getUser().getUserId(), user.getUser().getUsername(), user,
          user.getAccessLevel());

      // Handle user type pages
      if (user instanceof Administrator) {

        adminstratorPage adminFrame = new adminstratorPage();
        adminFrame.setVisible(true);
        adminFrame.pack();
        adminFrame.setLocationRelativeTo(null);
        frame.dispose();

      } else if (user instanceof SalesManager) {

        salesManagerPage salesFrame = new salesManagerPage();
        salesFrame.setVisible(true);
        salesFrame.pack();
        salesFrame.setLocationRelativeTo(null);
        frame.dispose();

      } else if (user instanceof PurchaseManager) {

        purchaseManagerPage purchaseFrame = new purchaseManagerPage();
        purchaseFrame.setVisible(true);
        purchaseFrame.pack();
        purchaseFrame.setLocationRelativeTo(null);
        frame.dispose();

      } else if (user instanceof FinanceManager) {

        financeManagerPage financeFrame = new financeManagerPage();
        financeFrame.setVisible(true);
        financeFrame.pack();
        financeFrame.setLocationRelativeTo(null);
        frame.dispose();

      } else if (user instanceof InventoryManager) {

        inventoryManagerPage inventoryFrame = new inventoryManagerPage();
        inventoryFrame.setVisible(true);
        inventoryFrame.pack();
        inventoryFrame.setLocationRelativeTo(null);
        frame.dispose();

      }
    } else {
      JOptionPane.showMessageDialog(frame, "Invalid email or password");
      passwordField.setText("");
    }
  }

  private UserType authenticate(String email, String password) {
    FileHandler fileHandler = new FileHandler("src/assignment/database/users.txt");
    List<String[]> users = fileHandler.readData();

    for (String[] user : users) {
      if ((user[1].equals(email) || user[2].equals(email)) && user[4].equals(password)) {
        int accessLevel = Integer.parseInt(user[3]);
        UserType userType = createUserByAccessLevel(accessLevel);
        if (userType != null) {
          userType.setUser(new User(user[0], user[1], user[2], user[4], userType));
        }
        return userType;
      }
    }
    return null;
  }

  private UserType createUserByAccessLevel(int accessLevel) {
    switch (accessLevel) {
      case 1:
        return new Administrator();
      case 2:
        return new PurchaseManager();
      case 3:
        return new SalesManager();
      case 4:
        return new FinanceManager();
      case 5:
        return new InventoryManager();
      default:
        return null;
    }
  }

  public void logout() {
    Session.getInstance().clearSession();
    Login loginFrame = new Login();
    loginFrame.setVisible(true);
    loginFrame.pack();
    loginFrame.setLocationRelativeTo(null);
  }
}
