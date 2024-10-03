package ss2_loop.Thuc_Hanh;

import java.util.Scanner;

public class Calculate_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        double money = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the rate per month: ");
        double rate = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the number of months: ");
        int months = Integer.parseInt(sc.nextLine());
        double interest = 0;
        for (int i = 0; i < months; i++) {
            interest += money * (rate/100)/12;
        }
        System.out.println("Total interest = " + interest);
    }
}
