package ss3_array_method.Thuc_Hanh;

import java.util.Scanner;

public class Count_Passed_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter scores: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
