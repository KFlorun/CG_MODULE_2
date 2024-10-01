package ss7_Abstract_Interface.Bai_Tap.Resizeable;

import ss7_Abstract_Interface.Thuc_Hanh.Animal_Interface.Animal;

public abstract class Geometric implements Resizeable{
    public Geometric() {
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
