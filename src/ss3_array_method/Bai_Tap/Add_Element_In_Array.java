package ss3_array_method.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter the element to add: ");
        int n = Integer.parseInt(sc.next());
        System.out.println("Enter index: ");
        int index = Integer.parseInt(sc.next());
        if (index < -1 || index >= arr.length - 1) {
            System.out.println("Invalid index");
        } else {
            System.out.println(Arrays.toString(addElementInArray(arr,index,n)));
        }
    }
    public static int[] addElementInArray(int[] arr, int index, int val) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}
