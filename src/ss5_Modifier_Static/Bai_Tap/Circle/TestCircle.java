package ss5_Modifier_Static.Bai_Tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        Circle c2 = new Circle(5.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.toString());
    }

}
