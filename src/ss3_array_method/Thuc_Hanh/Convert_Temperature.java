package ss3_array_method.Thuc_Hanh;

import java.util.Scanner;

public class Convert_Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double F;
        double C;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.next());
            switch (choice) {
                case 1:
                    System.out.println("Enter F: ");
                    F = Float.parseFloat(input.next());
                    System.out.println("C = " + FtoC(F));
                    break;
                case 2:
                    System.out.println("Enter C: ");
                    C = Float.parseFloat(input.next());
                    System.out.println("F = " + CtoF(C));
                    break;
                case 0:
                    System.exit(0);
            }
        } while(choice != 0);
    }
    public static double CtoF(double C) {
        return (9.0/5) * C + 32;
    }public static double FtoC(double F) {
        return (5.0/9) * (F - 32);
    }
}
