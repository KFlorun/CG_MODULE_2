package ss6_Inheritance.Thuc_Hanh.Geometric;

public class Geometric {
    protected String color = "white";
    private String filled = null;
    public Geometric(){
    }
    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }
    public String toString() {
        return " created with " +" "+ color +" " + " and filled with " + (filled == null ? "no fill": filled + " color");
    }
}
