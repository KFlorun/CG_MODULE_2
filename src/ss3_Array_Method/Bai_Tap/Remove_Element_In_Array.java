package ss3_Array_Method.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,4,7,2,7};
        System.out.println("Enter the element to be removed");
        int num = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                check = true;
            }
        }
        if (check) {
            System.out.println(num + " is in the array");
            System.out.println(Arrays.toString(removeElementInArray(arr, num)));
        } else {
            System.out.println(num + " is not in the array");
        }
    }
    public static int[] removeElementInArray(int[] array, int val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                newArray[index++] = array[i];
            }
        }
        return newArray;
    }
}
