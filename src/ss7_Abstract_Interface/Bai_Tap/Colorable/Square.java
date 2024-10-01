package ss7_Abstract_Interface.Bai_Tap.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square(){}

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + "}";
    }

    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
}
