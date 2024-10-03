package ss1_introduction_java.Thuc_Hanh;

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation Resolver");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double DenTa = b * b - 4 * a * c;
        if (DenTa > 0) {
            System.out.println("Equation has two solutions: ");
            System.out.println("x1 = " + String.format("%.2f", (-b + Math.sqrt(DenTa)) / (2 * a)));
            System.out.println("x2 = " + String.format("%.2f", (-b - Math.sqrt(DenTa)) / (2 * a)));
        } else if (DenTa == 0) {
            System.out.println("Equation has double solution");
            System.out.println("x1 = x2 = " + String.format("%.2f", (-b / (2 * a))));
        } else {
            System.out.println("Equation has no solution");
        }
    }
}
