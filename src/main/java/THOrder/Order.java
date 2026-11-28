package THOrder;

public class Order {

  private int id;
  private String customerName;
  private String productName;
  private int quantity;
  private double unitPrice;

  public Order(int id, String customerName, String productName, int quantity, double unitPrice) {
    setId(id);
    setCustomerName(customerName);
    setProductName(productName);
    setQuantity(quantity);
    setUnitPrice(unitPrice);
  }

  public void setId (int id) {
    if (id <= 0 ) {
      throw new IllegalArgumentException("Id thi khong duoc nho hon 0");
    }

    this.id = id;
  }

  public void setCustomerName(String customerName) {
    if (customerName == "" || customerName == null) {
      throw new IllegalArgumentException("Ten thi khong duoc de trong");
    }

    this.customerName = customerName;
  }

  public void setProductName(String productName) {
    if (productName == "" || productName == null) {
      throw new IllegalArgumentException("Ten thi khong duoc de trong");
    }

    this.productName = productName;
  }

  public void setQuantity (int quantity) {
    if ( quantity < 0 ) {
      throw new IllegalArgumentException("So luong thi khong duoc nho hon 0");
    }

    this.quantity = quantity;
  }

  public void setUnitPrice (double unitPrice) {
    if (unitPrice < 0 ) {
      throw new IllegalArgumentException("Gia tien thi khong duoc nho hon 0");
    }

    this.unitPrice = unitPrice;
  }

  public int getId () {
    return id;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getProductName() {
    return productName;
  }

  public int getQuantity () {
    return quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

}