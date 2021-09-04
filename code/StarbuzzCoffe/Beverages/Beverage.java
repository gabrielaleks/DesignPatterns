package Beverages;

public abstract class Beverage {
    String description = "Unknown Beverage";
    String size = "Tall";

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}