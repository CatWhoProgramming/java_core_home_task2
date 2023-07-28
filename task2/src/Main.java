import task2.Car;
import task5.MyArea;


public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2 ----------------------------");
        callCarClassFromTask2();
        System.out.println("Task 3 ----------------------------");
        callCarClassFromTask3();
        System.out.println("Task 4 ----------------------------");
        callCarClassFromTask4();
        System.out.println("Task 5 ----------------------------");
        calculateAreaOfCircle();
    }

    private static void calculateAreaOfCircle() {
        System.out.println("area of circle " + MyArea.areaOfCircle(34.6));
    }

    private static void callCarClassFromTask4() {
        task4.Car car = new task4.Car();
        System.out.println("Without parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1876);
        System.out.println("With one parameter: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1987, 23.4);
        System.out.println("With two parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1234, 76.4, 2);
        System.out.println("With three parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task4.Car(1234, 76.4, 2, "blue");
        System.out.println("With four parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        System.out.println("----------------------------------------------------------");

    }

    private static void callCarClassFromTask3() {
        task3.Car car = new task3.Car();
        System.out.println("Without parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1876);
        System.out.println("With one parameter: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1987, 23.4);
        System.out.println("With two parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1234, 76.4, 2);
        System.out.println("With three parameters: " + "\n" + car.getYear() + "\n" +
                car.getSpeed() + "\n" +
                car.getWeight() + "\n" +
                car.getColor());
        car = new task3.Car(1234, 76.4, 2, "blue");
        System.out.println("With four parameters: " + "\n" + car.getYear() + "\n" +
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