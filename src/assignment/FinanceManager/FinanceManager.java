package assignment.FinanceManager;

import java.util.List;
import assignment.FileHandler;
import assignment.UserType;

public class FinanceManager extends UserType {
  private FileHandler fileHandler;
  public FinanceManager() {
    super();
    this.accessLevel = 4;
    this.department = "Finance";
    this.fileHandler = new FileHandler("src/assignment/database/stock.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("VIEW_FINANCE");
    permissions.add("EDIT_FINANCE");
    permissions.add("GENERATE_REPORTS");
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

public void manageSupplierPayment() {
  // Implementation
}

}
