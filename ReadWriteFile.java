package Quanlyspham;

import java.io.*;
import java.util.List;

public class ReadWriteFile {

    public static final String PATHNAME = "product.txt";

    public static void writeFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATHNAME))) {
            oos.writeObject(products);
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }

    public static List<Product> readFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATHNAME))) {
            return (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file: " + e.getMessage());
            throw new RuntimeException("Không tìm thấy file", e);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file" + e.getMessage());
            throw new RuntimeException("Lỗi ghi vào file", e);
        }
    }
}

