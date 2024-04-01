package Quanlyspham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Sửa thông tin sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Product newProduct = createNew(scanner);
                    ProductManager.addNewProduct(newProduct);
                    break;
                case 2:
                    System.out.println("\nDanh sách sản phẩm:");
                    ProductManager.displayProducts();
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm theo id: ");
                    String productId = scanner.nextLine();
                    ProductManager.findProduct(productId);
                    break;
                case 4:
                    System.out.println("Nhập mã sản phẩm cần xóa: ");
                    String productId1 = scanner.nextLine();
                    ProductManager.removeProduct(productId1);
                case 5:
                    System.out.print("Nhập mã sản phẩm cần sửa: ");
                    String productIdToEdit = scanner.nextLine();
                    Product updatedProduct = createNew(scanner);
                    ProductManager.editProduct(productIdToEdit, updatedProduct);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public static Product createNew(Scanner scanner) {
        System.out.print("Nhập id: ");
        String productId = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập hãng: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        return new Product(productId, name, price, manufacturer, description);
    }
}
