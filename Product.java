package Quanlyspham;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String productId, String name, double price, String manufacturer, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

