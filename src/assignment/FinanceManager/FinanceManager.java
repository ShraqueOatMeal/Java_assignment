package assignment.FinanceManager;

import java.io.File;
import java.util.List;
import assignment.FileHandler;
import assignment.UserType;
import assignment.FileHandler;
import java.util.List;

public class FinanceManager extends UserType {
  private FileHandler fileHandler;
  private String username;
  private FileHandler supplierHandler;

  public FinanceManager() {
    super();
    this.accessLevel = 4;
    this.fileHandler = new FileHandler("src/assignment/database/stock.txt");
    this.supplierHandler = new FileHandler("src/assignment/database/suppliers.txt");
  }

  public List<String[]> approvePayment() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public List<String[]> checkStockStatus() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/stock.txt");
    return fileHandler.readData();
  }

  public List<String[]> manageSupplierPayment() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/approvedPurchaseOrder.txt");
    return fileHandler.readData();
  }
}
