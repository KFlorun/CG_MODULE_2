package ss4_oop.Bai_Tap;

import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation Resolver");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        System.out.println("a: " + q.getA());
        System.out.println("b: " + q.getB());
        System.out.println("c: " + q.getC());
        double denTa = q.getDiscriminant();
        if (denTa > 0) {
            System.out.println("x1 = " + q.getRoot1());
            System.out.println("x2 = " + q.getRoot2());
        } else if (denTa == 0) {
            System.out.println("x1 = x2 = " + q.getRootDouble());
        } else {
            System.out.println("The equation has no solution");
        }
    }
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRootDouble() {
        return -b / (2 * a);
    }
}
