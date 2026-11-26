package THProduct;

public class printProduct {
    
    public void displayProductInfo(Product product) { 
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: $" + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());
    }

}
