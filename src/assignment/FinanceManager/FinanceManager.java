package assignment.FinanceManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;


public class FinanceManager extends UserType {
  private FileHandler fileHandler;
  private String username;

  public FinanceManager() {
    super();
    this.accessLevel = 4;
    this.department = "Finance";
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_FINANCE");
    permissions.add("EDIT_FINANCE");
    permissions.add("GENERATE_REPORTS");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }
  public List<String[]> approvePayment() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public List<String[]> checkStockStatus() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/stock.txt");
    return fileHandler.readData();
  }
}
