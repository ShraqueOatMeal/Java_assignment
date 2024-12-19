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
    this.userFileHandler = new FileHandler("src/assignment/database/users.txt");
  }

  public boolean addUser(String userId, String username, String email, int accessLevel, String password) {
    try {
      // Check if username already exists
      List<String[]> users = userFileHandler.readData();
      for (String[] user : users) {
        if (user[1].equals(username) || user[0].equals(userId) || user[2].equals(email)) {
          JOptionPane.showMessageDialog(null,
              "User ID, username, or email already exists!",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          return false;
        }
      }

      String record = String.format("%s,%s,%s,%d,%s",
          userId,
          username, email, accessLevel, password);

      List<String> allRecords = new ArrayList<>();
      for (String[] user : users) {
        allRecords.add(String.join(",", user));
      }
      allRecords.add(record);

      userFileHandler.clearFileContents();
      userFileHandler.writeRecords(allRecords);

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
        if (!user[1].equals(username)) {
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

      userFileHandler.clearFileContents();
      userFileHandler.writeRecords(updatedRecords);

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
        if (user[1].equals(username)) {
          // Update user information
          String updatedRecord = String.format("%s,%s,%s,%d,%s",
              user[0],
              username,
              newEmail.isEmpty() ? user[2] : newEmail,
              newAccessLevel == 0 ? Integer.parseInt(user[3]) : newAccessLevel,
              newPassword.isEmpty() ? user[4] : newPassword);
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
      userFileHandler.clearFileContents();
      userFileHandler.writeRecords(updatedRecords);

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
}
