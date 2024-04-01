package Quanlyspham;

import java.util.List;

public interface IReadWriteFile {
    List<Product> readFile();
    void writeFile(List<Product> products);
}
