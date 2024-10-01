package ss7_Abstract_Interface.Bai_Tap.Resizeable;

public class Square extends Rectangle{
    public Square(){}

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + "}";
    }
}
