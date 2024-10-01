package ss6_Inheritance.Bai_tap.Circle;

public class Test {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(2,3, "red");
        System.out.println(cyl.getVolume());
        System.out.println(cyl.toString());
        Circle cir = new Circle(5, "green");
        System.out.println(cir.toString());
    }
}
