package ss3_array_method.Thuc_Hanh;

import java.util.Scanner;

public class Find_Min_By_Mode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input.next());
        }
        int[] result = findMin(arr);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] findMin(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }
}
