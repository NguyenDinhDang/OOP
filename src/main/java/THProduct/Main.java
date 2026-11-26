package THProduct;

public class Main {
    public static void main(String[] args) {
        Product product[] = {
            new Product(1, "Laptop", 999.99, 10),
            new Product(2, "Smartphone", 499.99, 20),
            new Product(3, "Tablet", 2999.99, 15),
            new Product(4, "Headphones", 79.99, 30),
            new Product(5, "Smartwatch", 1199.99, 25)
        };
        printProduct printer = new printProduct();
        // for (Product products : product) {
        //     printer.displayProductInfo(products);
        //     System.out.println("Total Price: $" + products.calculateTotalPrice(products));
        //     System.out.println();
        // }

        // for(Product products : product) {
        //     if(products.getPrice() < 100) {
        //         System.out.println("Product ID: " + products.getId());
        //         System.out.println("Product Name: " + products.getName());
        //         System.out.println("Product Price: $" + products.getPrice());
        //         System.out.println("Product Quantity: " + products.getQuantity());
        //         System.out.println();
        //     }
        // }
        // Product maxProduct = product[0];
        // for(int i = 1; i < product.length; i++) {
        //     if(product[i].getPrice() > maxProduct.getPrice()) {
        //         maxProduct = product[i];
        //     }
        // }
        // System.out.println("Maximum Price: $" + maxProduct.getPrice());
        // System.out.println("Product Name: " + maxProduct.getName());
        // System.out.println("Product ID: " + maxProduct.getId());
        // System.out.println("Product Quantity: " + maxProduct.getQuantity());

        ProductServices find = new ProductServices();
        printer.displayProductInfo(find.findProductById(product, 4));
        printer.displayProductInfo(find.maxValueProduct(product));
    }
    
}
