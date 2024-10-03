package ss7_abstract_interface.Thuc_Hanh.ComparableCircle;

public abstract class Geometric {
    private String color;
    private boolean filled;

    protected Geometric(){
    }

    protected Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
