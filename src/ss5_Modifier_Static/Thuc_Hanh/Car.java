package ss5_Modifier_Static.Thuc_Hanh;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car("Xe Om", "Rice");
        System.out.println(numberOfCars);
        Car car2 = new Car("Xe Bo", "Rice");
        System.out.println(numberOfCars);
    }
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
