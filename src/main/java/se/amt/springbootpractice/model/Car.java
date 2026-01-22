package se.amt.springbootpractice.model;


public class Car {
    private String brand;
    private int year;
    private String color;
    private boolean isAutomatic;

    public Car() {
    }

    public Car(String brand, int year, String color, boolean isAutomatic) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
