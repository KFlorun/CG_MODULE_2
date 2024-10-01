package ss2_Loop.Bai_Tap;

import java.util.Scanner;

public class Display_20_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime: ");
        int n = Integer.parseInt(sc.nextLine());
        int num = 0;
        int N = 2;
        while (num < n) {
            int i = 2;
            boolean check = true;
            while (i < N) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                num++;
            }
            N++;
        }
    }
}
