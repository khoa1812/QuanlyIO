package Quanlyspham;

import java.util.List;

public class ProductManager {
    private static List<Product> products = ReadWriteFile.readFile();

    public static void addNewUser(Product product){
        products.add(product);
        ReadWriteFile.writeFile(products);
    }

    public static Product displayProduct (){

    }

    public static void findProduct(Product product){

    }
}
