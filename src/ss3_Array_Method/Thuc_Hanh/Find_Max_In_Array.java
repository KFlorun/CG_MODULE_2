package ss3_Array_Method.Thuc_Hanh;

import java.util.Scanner;

public class Find_Max_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        int max = arr[0];
        int min = arr[0];
        for (int num: arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
