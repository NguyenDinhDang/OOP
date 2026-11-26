package THProduct;

import java.util.Scanner;

public class ProductServices {
    //Tìm kiếm dựa trên ID
    public Product findProductById(Product[] products, int id) {

        for (int i = 0; i<products.length; i++) {

            if(products[i].getId() == id) {
                return products[i];
            } 
        }
        return null;
    }

    //Nhập n sản phẩm từ bàn phím và trả về mảng
    public Product[] inputProducts(int n) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(id, name, price, quantity);
        }
        scanner.close();
        return products;
    }

    public double calculateTotalValue(Product[] products) {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    public Product maxValueProduct (Product[] products) {
        Product maxProduct = products[0];
        for(int i = 1; i < products.length; i++) {
            if(products[i].getPrice() > maxProduct.getPrice()) {
                maxProduct = products[i];
            }
        }
        return maxProduct;
    }

}
