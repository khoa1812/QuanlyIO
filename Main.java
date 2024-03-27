package Quanlyspham;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(product);
        Product newU = createNew();
        ProductManager.addNewUser(newU);
    }

    public static Product createNew(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap id");
        String productId = scanner.nextLine();
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap gia");
        double price = scanner.nextInt();
        System.out.println("nhap hang");
        String manufacturer = scanner.nextLine();
        System.out.println("nhap mo ta");
        String description = scanner.nextLine();
        return new Product(productId, name, price, manufacturer, description);
    }
}
