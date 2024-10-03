package ss5_modifier_static.Bai_Tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

