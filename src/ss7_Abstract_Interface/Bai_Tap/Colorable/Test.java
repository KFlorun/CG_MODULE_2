package ss7_Abstract_Interface.Bai_Tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[3];
        geometrics[0] = new Circle();
        geometrics[1] = new Rectangle();
        geometrics[2] = new Square();

        for (Geometric geometric: geometrics) {
            if (geometric instanceof Colorable) {
                System.out.println(((Colorable) geometric).howToColor());
            }
        }
    }
}
