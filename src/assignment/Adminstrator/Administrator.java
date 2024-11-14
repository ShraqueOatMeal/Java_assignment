package assignment.Adminstrator;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrator extends UserType {
  private FileHandler userFileHandler;

  public Administrator() {
    super();
    this.accessLevel = 1;
    this.department = "Administrator";
    this.userFileHandler = new FileHandler("src/assignment/database/users.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("ALL");
  }

  public boolean addUser(String username, String email, int accessLevel, String password) {
    try {
      // Check if username already exists
      List<String[]> users = userFileHandler.readData();
      for (String[] user : users) {
        if (user[0].equals(username)) {
          JOptionPane.showMessageDialog(null,
              "Username already exists!",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      // Add new user
      String record = String.format("%s,%s,%d,%s",
          username, email, accessLevel, password);
      userFileHandler.addRecord(users.size() + 1, record);
      userFileHandler.saveAllRecords();

      JOptionPane.showMessageDialog(null,
          "User added successfully!",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error adding user: " + e.getMessage(),
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean removeUser(String username) {
    try {
      List<String[]> users = userFileHandler.readData();
      List<String> updatedRecords = new ArrayList<>();
      boolean userFound = false;

      for (String[] user : users) {
        if (!user[0].equals(username)) {
          updatedRecords.add(String.join(",", user));
        } else {
          userFound = true;
        }
      }

      if (!userFound) {
        JOptionPane.showMessageDialog(null,
            "User not found!",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }

      userFileHandler = new FileHandler("users.txt");
      for (int i = 0; i < updatedRecords.size(); i++) {
        String[] parts = updatedRecords.get(i).split(",");
        userFileHandler.addRecord(i + 1, updatedRecords.get(i));
      }
      userFileHandler.saveAllRecords();

      JOptionPane.showMessageDialog(null,
          "User removed successfully!",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error removing user: " + e.getMessage(),
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public boolean modifyUser(String username, String newEmail, int newAccessLevel, String newPassword) {
    try {
      List<String[]> users = userFileHandler.readData();
      List<String> updatedRecords = new ArrayList<>();
      boolean userFound = false;

      for (String[] user : users) {
        if (user[0].equals(username)) {
          // Update user information
          String updatedRecord = String.format("%s,%s,%d,%s",
              username,
              newEmail.isEmpty() ? user[1] : newEmail,
              newAccessLevel == 0 ? Integer.parseInt(user[2]) : newAccessLevel,
              newPassword.isEmpty() ? user[3] : newPassword);
          updatedRecords.add(updatedRecord);
          userFound = true;
        } else {
          updatedRecords.add(String.join(",", user));
        }
      }

      if (!userFound) {
        JOptionPane.showMessageDialog(null,
            "User not found!",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }

      // Create new FileHandler instance and save updated records
      userFileHandler = new FileHandler("users.txt");
      for (int i = 0; i < updatedRecords.size(); i++) {
        userFileHandler.addRecord(i + 1, updatedRecords.get(i));
      }
      userFileHandler.saveAllRecords();

      JOptionPane.showMessageDialog(null,
          "User profile updated successfully!",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);
      return true;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
          "Error updating user: " + e.getMessage(),
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public List<String[]> viewUsers() {
    return userFileHandler.readData();
  }

  public void changePassword() {
    // Implementation
  }
}
