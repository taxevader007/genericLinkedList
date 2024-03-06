package model;

public class Laptop {

    private String brand;
    private String model;
    private String processor;
    private int ram;
    private String graphics;
    private int price;

    public Laptop(String brand, String model, String processor, int ram, int storage, String graphics, String os, int price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.graphics = graphics;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphics() {
        return graphics;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphics='" + graphics + '\'' +
                ", price=" + price +
                '}';
    }
    
}
