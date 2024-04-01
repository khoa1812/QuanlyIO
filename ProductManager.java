package Quanlyspham;

import java.util.List;

public class ProductManager {
    private static IReadWriteFile readWriteFile = new ReadWriteFile();
    private static List<Product> products = readWriteFile.readFile();

    public static void addNewProduct(Product product) {
        products.add(product);
        readWriteFile.writeFile(products);
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

    public static void removeProduct(String productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            readWriteFile.writeFile(products);
            System.out.println("Sản phẩm đã được xóa.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + productId);
        }
    }

    public static void editProduct(String productId, Product updatedProduct) {
        int productIndex = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(productId)) {
                productIndex = i;
                break;
            }
        }
        if (productIndex != -1) {

            products.set(productIndex, updatedProduct);
            readWriteFile.writeFile(products);
            System.out.println("Sản phẩm đã được cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + productId);
        }
    }


}
