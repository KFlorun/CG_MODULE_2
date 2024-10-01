package ss1_Introduction_Java.Thuc_Hanh;

import java.util.Scanner;

public class Linear_Equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        if (a != 0) {
            double ans = (c - b) / a;
            System.out.printf("x = %.2f: ", ans);
        } else {
            if (b == c) {
                System.out.println("The equation has infinitely many solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        }
    }
}