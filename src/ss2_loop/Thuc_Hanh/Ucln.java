package ss2_loop.Thuc_Hanh;

import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(sc.nextLine());
        while(a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println(a);

    }
}
