package ss3_Array_Method.Bai_Tap;

import java.util.Scanner;

public class Sum_Column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter index of column to sum: ");
        int col = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i][col];
        }
        System.out.println(sum);
    }
}
