package ss6_inheritance.Thuc_Hanh.Geometric;

public class Circle extends Geometric{
    private static double Pi = 3.14;
    private double radius;
    public Circle(){
    }
    public Circle(String color, String filled) {
        super(color, filled);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, String filled) {
        this(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Pi * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Pi * radius;
    }
    public double getDiameter() {
        return 2 * radius;
    }

}
