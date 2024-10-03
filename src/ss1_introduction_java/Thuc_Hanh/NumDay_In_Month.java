package ss1_introduction_java.Thuc_Hanh;

import java.util.Scanner;

public class NumDay_In_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            switch(month) {
                case 2:
                    System.out.println("Month " + month + " has 28 days");
                    validInput = true;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Month " + month + " has 31 days");
                    validInput = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Month " + month + " has 30 days");
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid input! Enter month again: ");
                    break;
            }
        }

    }
}
