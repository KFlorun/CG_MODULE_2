package ss2_loop.Thuc_Hanh;

import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n < 2) {
            System.out.println("Not Prime");
        } else if (n == 2) {
            System.out.println("Prime");
        } else {
            int i = 2;
            boolean isPrime = true;
            while(i < n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("NOT Prime");
            }
        }
    }
}
