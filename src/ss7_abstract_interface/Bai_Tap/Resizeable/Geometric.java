package ss7_abstract_interface.Bai_Tap.Resizeable;

public abstract class Geometric implements Resizeable{
    public Geometric() {
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
