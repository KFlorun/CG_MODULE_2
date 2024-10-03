package ss15_exception.Bai_Tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Enter b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Enter c: ");
            int c = Integer.parseInt(sc.nextLine());
            checkIllegalTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Invalid triangle: " + e.getMessage());
        }

    }
    public IllegalTriangleException(String error) {
        super(error);
    }
    public static void checkIllegalTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("The side of triangle must be positive.");
        }
        if (a + b >= c || a + c >= b || b + c >= a) {
            throw new IllegalTriangleException("Sum of 2 sides must be larger than the third.");
        }
    }
}
