package ss6_inheritance.Bai_tap.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height + ',' +
                "radius = " + getRadius() + ',' +
                (getColor() == null? "no color": getColor()) +
                '}';
    }
}
