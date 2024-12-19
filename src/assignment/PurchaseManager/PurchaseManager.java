package assignment.PurchaseManager;

import assignment.UserType;
import assignment.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class PurchaseManager extends UserType {
  private FileHandler fileHandler;
  private FileHandler purchOrderHandler;
  private List<PurchaseOrder> purchaseOrders;
  // private List<Supplier> assignedSuppliers;

  public PurchaseManager() {
    super();
    this.accessLevel = 2;
    this.fileHandler = new FileHandler("src/assignment/database/requisition.txt");
    this.purchOrderHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    this.purchaseOrders = loadPurchaseOrders();
  }

  public List<String[]> checkStockLevel() {
    FileHandler stockFile = new FileHandler("src/assignment/database/stock.txt");
    List<String[]> stockList = stockFile.readData();

    return stockList;
  }

  public List<String[]> viewSuppliers() {
    FileHandler supplier = new FileHandler("src/assignment/database/suppliers.txt");
    List<String[]> suppliers = supplier.readData();

    return suppliers;
  }

  public List<String[]> viewRequisitions() {
    return fileHandler.readData();
  }

  public void createPurchaseOrder(String itemName, int quantity, String userId, String date, String itemId,
      String supId, String price) {
    PurchaseOrder newOrder = new PurchaseOrder(itemName, itemId, supId, userId, quantity, date, price);
    purchaseOrders.add(newOrder);
    purchOrderHandler.addRecord(newOrder.toArray());
  }

  public List<PurchaseOrder> loadPurchaseOrders() {
    List<String[]> records = purchOrderHandler.readData();
    List<PurchaseOrder> orders = new ArrayList<>();
    return orders;
  }

  public List<String[]> viewPurchaseOrder() {
    FileHandler fileHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return fileHandler.readData();
  }

  public void saveAll() {
    fileHandler.saveAllRecords();
    purchOrderHandler.saveAllRecords();
  }
}
