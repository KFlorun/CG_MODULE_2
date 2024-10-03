package ss7_abstract_interface.Thuc_Hanh.GeometricObject;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 3, "red", true);
        Circle cir = new Circle(4,"blue", false);

        System.out.println(rec.toString());
        System.out.println(cir.toString());
        System.out.println(rec.isFilled());

        Geometric rec1 = new Rectangle();
        System.out.println(rec1.getArea());
    }
}
