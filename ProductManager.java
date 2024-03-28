package Quanlyspham;

import java.util.List;

public class ProductManager {
    private static List<Product> products = ReadWriteFile.readFile();

    public static void addNewProduct(Product product) {
        products.add(product);
        ReadWriteFile.writeFile(products);
        System.out.println("Sản phẩm đã được thêm thành công.");
    }

    public static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void findProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                System.out.println("Sản phẩm được tìm thấy: " + product);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã: " + productId);
    }
}
