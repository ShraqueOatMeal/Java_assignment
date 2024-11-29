package assignment.SalesManager;

import assignment.UserType;
import assignment.FileHandler;
import java.util.List;
import java.util.Arrays;

public class SalesManager extends UserType {
  private FileHandler fileHandler;
  private String username;
  private String userId;
  private String date;

  public SalesManager() {
    super();
    this.accessLevel = 3;
    this.department = "Sales";
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
  }

  @Override
  protected void initializePermissions() {
    permissions.add("Create Requisition");
    permissions.add("View Items");
    permissions.add("Enter Daily Sales");
    permissions.add("Generate Sales Report");
    permissions.add("Check Stock Level");
    permissions.add("View Purchase Orders");
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return userId;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate() {
    return date;
  }

  public void createRequisition(String itemName, int quantity, String userId, String date, String itemId,
      String supId) {
    int newRequisitionID = fileHandler.getLastId() + 1;
    String status = "Pending";
    String[] record = { String.valueOf(newRequisitionID), itemName, String.valueOf(quantity), status,
        userId, date, itemId, supId };
    fileHandler.addRecord(record);
  }

  public List<String[]> viewPurchaseOrder() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public void viewItems() {
    // Implementation
  }

  public void enterDailySales() {
    // Implementation
  }

  public void generateSalesReport() {
    // Implementation
  }

  public List<String[]> checkStockLevel() {
    FileHandler stockFile = new FileHandler("src/assignment/database/stock.txt");
    FileHandler itemFile = new FileHandler("src/assignment/database/item.txt");
    List<String[]> stockList = stockFile.readData();

    // Get item itemName
    List<String[]> itemList = itemFile.readData();
    for (String[] item : itemList) {
      String itemId = item[0];
      String itemName = item[1];
      for (String[] stock : stockList) {
        if (stock[0].equals(itemId)) {

        }
      }
    }
    System.out.println(Arrays.deepToString(stockList.get(0)));
    return stockList;
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
  }
}
