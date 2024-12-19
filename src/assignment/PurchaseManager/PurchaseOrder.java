package assignment.PurchaseManager;

import assignment.FileHandler;
import java.util.List;

public class PurchaseOrder {
  private String purchaseOrderId;
  private String itemName;
  private String itemId;
  private String supplierId;
  private String userId;
  private int quantity;
  private String date;
  private String price;
  private String status;

  // Constructor
  public PurchaseOrder(String itemName, String itemId, String supplierId, String userId,
      int quantity, String date, String price) {
    this.purchaseOrderId = generatePurchaseOrderId();
    this.itemName = itemName;
    this.itemId = itemId;
    this.supplierId = supplierId;
    this.userId = userId;
    this.quantity = quantity;
    this.date = date;
    this.price = price;
    this.status = "Approved"; // Default status matching PurchaseManager
  }

  // Method to convert PurchaseOrder to array format for FileHandler
  protected String[] toArray() {
    return new String[] {
        purchaseOrderId,
        itemName,
        String.valueOf(quantity),
        status,
        userId,
        date,
        itemId,
        supplierId,
        price
    };
  }

  private String generatePurchaseOrderId() {
    FileHandler purchOrderHandler = new FileHandler("src/assignment/database/purchOrder.txt");
    return "PO" + String.valueOf(purchOrderHandler.getLastId() + 1);
  }

  // Getters
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public String getItemName() {
    return itemName;
  }

  public String getItemId() {
    return itemId;
  }

  public String getSupplierId() {
    return supplierId;
  }

  public String getUserId() {
    return userId;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDate() {
    return date;
  }

  public String getPrice() {
    return price;
  }

  public String getStatus() {
    return status;
  }

  // Static method to get all purchase orders
  public static List<String[]> getAllPurchaseOrders(PurchaseManager purchaseManager) {
    return purchaseManager.viewPurchaseOrder();
  }

  // Calculate total cost
  public double getTotalCost() {
    return Double.parseDouble(price) * quantity;
  }
}