package assignment.FinanceManager;

import java.io.File;
import java.util.List;
import assignment.FileHandler;
import assignment.UserType;

public class FinanceManager extends UserType {
  private FileHandler fileHandler;
  private FileHandler supplierHandler;

  public FinanceManager() {
    super();
    this.accessLevel = 4;
    this.department = "Finance";
    this.fileHandler = new FileHandler("src/assignment/database/stock.txt");
    this.supplierHandler = new FileHandler("src/assignment/database/supplier.txt");
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

  public List<String[]> checkStockStatus() {
    return fileHandler.readData();
  }

  public void generateFinancialReport() {
    // Implementation
  }

  public void approvePayment() {
    // Implementation
  }

  public List<String[]> manageSupplierPayment() {
    return supplierHandler.readData();
    // Implementation
  }

}
