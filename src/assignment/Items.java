package assignment;

import java.util.List;
import assignment.Supplier;
import assignment.FileHandler;

public class Items {
  private String itemId;
  private String itemName;
  private Supplier supplier;

  public Items(String itemId, String itemName, Supplier supplier) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.supplier = supplier;
  }

  public Items(String itemName) {
    FileHandler fileHandler = new FileHandler("src/assignment/database/stock.txt");
    List<String[]> items = fileHandler.readData();
    for (String[] itemData : items) {
      if (itemData[1].equals(itemName)) {
        itemId = itemData[0];
      }
    }
  }

  public Items() {
  }

  // Getters and setters

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public String getSupplierId() {
    return supplier.getSupplierId();
  }
}
