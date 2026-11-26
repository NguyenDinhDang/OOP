package THProduct;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) { 
        if (id <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Product quantity cannot be negative.");
        }
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Giá sản phẩm không thể âm.");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Số lượng sản phẩm không thể âm.");
        }
        this.quantity = quantity;
    }

    public int getId() { 
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotalPrice(Product product) {
        return product.getPrice() * product.getQuantity();
    }

}
