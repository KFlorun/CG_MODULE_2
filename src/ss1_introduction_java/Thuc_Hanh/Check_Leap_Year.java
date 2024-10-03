package ss1_introduction_java.Thuc_Hanh;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap Year");
                } else {
                    System.out.println(year + " is Not Leap Year");
                }
            } else {
                System.out.println(year + " is Leap Year");
            }
        } else {
            System.out.println(year + " is Not Leap Year");
        }
    }
}
