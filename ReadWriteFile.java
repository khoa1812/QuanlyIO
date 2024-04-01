package Quanlyspham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile implements IReadWriteFile {
    public static final String PATHNAME = "product.txt";

    public List<Product> readFile() {
        File file = new File(PATHNAME);
        if (!file.exists()) {
            return getDefaultProducts();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
            return getDefaultProducts();
        }
    }

    public void writeFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATHNAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }

    private List<Product> getDefaultProducts() {
        List<Product> defaultProducts = new ArrayList<>();
        defaultProducts.add(new Product("01", "Duy", 1000, "Hãng Samsung", "Chạy chậm, đơ lác"));
        defaultProducts.add(new Product("02", "Hieu", 2000, "Hãng Apple", "Gầy ốm"));
        defaultProducts.add(new Product("03", "Quan", 3000, "Hãng Dell", "Nhanh mượt"));

        writeFile(defaultProducts);
        return defaultProducts;
    }
}
