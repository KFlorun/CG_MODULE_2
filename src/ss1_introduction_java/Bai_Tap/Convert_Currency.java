package ss1_introduction_java.Bai_Tap;

import java.util.Scanner;

public class Convert_Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short rate = 23000;
        System.out.println("Enter 1 for VND to USD or 2 for USD to VND");
        byte ans = sc.nextByte();
        if (ans == 1) {
            System.out.println("Converting from VND to USD");
            System.out.println("Enter VND: ");
            int vnd = sc.nextInt();
            System.out.println(vnd / rate + " USD");
        } else if (ans == 2) {
            System.out.println("Converting from USD to VND");
            System.out.println("Enter USD: ");
            int usd = sc.nextInt();
            System.out.println(usd * rate + " VND");
        } else {
            System.out.println("ONLY VND => USD or USD => VND");
        }
    }
}
