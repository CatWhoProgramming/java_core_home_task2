import task2.Car;

public class Main {
    public static void main(String[] args) {
        callCarClass();

    }

    private static void callCarClass() {
        Car car = new Car();
        System.out.println(car.getColor() + " "+ car.getYear());
        car = new Car(3456, "green");
        System.out.println(car.getColor() + " "+ car.getYear());
        car = new Car("violet");
        System.out.println(car.getColor() + " "+ car.getYear());
    }
}