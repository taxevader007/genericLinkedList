package model;

public class Laptop implements Comparable<Laptop>{

    private String brand;
    private String model;
    private String processor;
    private int ram;
    private String graphics;
    private int price;

    @Override
    public int compareTo(Laptop o) {
        return 0;
    }

    
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setPrice(int price) {
        this.price = price;
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
