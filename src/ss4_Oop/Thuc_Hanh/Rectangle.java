package ss4_Oop.Thuc_Hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the width: ");
        double height = sc.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.display());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());
    }
    private double width;
    private double height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}