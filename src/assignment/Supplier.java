package assignment;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

  private String supplierId;
  private String name;
  private String address;

  public Supplier(String supplierId, String name, String address) {
    this.supplierId = supplierId;
    this.name = name;
    this.address = address;
  }

  public Supplier(String supplierId) {
    this.supplierId = supplierId;
  }

  public Supplier() {
  }

  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierID(String supplierID) {
    this.supplierId = supplierID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
