package ss6_Inheritance.Thuc_Hanh.Geometric;

public class Rectangle extends Geometric{
    private double width;
    private double height;
    public Rectangle() {
    }
    public Rectangle(String color, String filled) {
        super(color, filled);
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, String filled, double width, double height) {
        this(width, height);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return (height + width) * 2;
    }

}
