import task2.Car;


public class Main {
    public static void main(String[] args) {
        callCarClassFromTask2();
        callCarClassFromTask3();
        callCarClassFromTask4();
    }

    private static void callCarClassFromTask4() {
        task4.Car car = new task4.Car();
        System.out.println("Without parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1876);
        System.out.println("With one parameter: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1987, 23.4);
        System.out.println("With two parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1234, 76.4, 2);
        System.out.println("With three parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1234, 76.4, 2, "blue");
        System.out.println("With four parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        System.out.println("----------------------------------------------------------");

    }

    private static void callCarClassFromTask3() {
        task3.Car car = new task3.Car();
        System.out.println("Without parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1876);
        System.out.println("With one parameter: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1987, 23.4);
        System.out.println("With two parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1234, 76.4, 2);
        System.out.println("With three parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1234, 76.4, 2, "blue");
        System.out.println("With four parameters: " + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        System.out.println("----------------------------------------------------------");
    }

    private static void callCarClassFromTask2() {
        Car car = new Car();
        System.out.println(car.getColor() + " " + car.getYear());
        car = new Car(3456, "green");
        System.out.println(car.getColor() + " " + car.getYear());
        car = new Car("violet");
        System.out.println(car.getColor() + " " + car.getYear());
        System.out.println("----------------------------------------------------------");
    }
}