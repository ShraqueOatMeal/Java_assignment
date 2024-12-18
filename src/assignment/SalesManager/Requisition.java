package assignment.SalesManager;

import assignment.FileHandler;
import java.util.List;

public class Requisition {
  private String requisitionId;
  private String itemName;
  private String itemId;
  private String supplierId;
  private String userId;
  private int quantity;
  private String date;
  private String price;
  private String status;

  // Constructor
  public Requisition(String itemName, String itemId, String supplierId, String userId,
      int quantity, String date, String price) {
    this.requisitionId = generateRequisitionId();
    this.itemName = itemName;
    this.itemId = itemId;
    this.supplierId = supplierId;
    this.userId = userId;
    this.quantity = quantity;
    this.date = date;
    this.price = price;
    this.status = "Approved"; // Default status matching SalesManager
  }

  // Method to convert Requisition to array format for FileHandler
  public String[] toArray() {
    return new String[] {
        requisitionId,
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

  private String generateRequisitionId() {
    FileHandler purchOrderHandler = new FileHandler("src/assignment/database/requisition.txt");
    return "PR" + String.valueOf(purchOrderHandler.getLastId() + 1);
  }

  // Getters
  public String getRequisitionId() {
    return requisitionId;
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

  // Calculate total cost
  public double getTotalCost() {
    return Double.parseDouble(price) * quantity;
  }
}
