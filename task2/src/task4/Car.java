package task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
     this(2045, 500,4, "green");
    }

    public Car(int year) {
        this.year = year;

    }

    public Car(int year, double speed) {
        this(year,speed,34);
        this.year = year;
    }

    public Car(int year, double speed, int weight) {
        this();
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
