package ss3_array_method.Bai_Tap;

import java.util.Arrays;

public class Combine_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(combineTwoArrays(arr1, arr2)));
    }
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr2.length] = arr2[i];
        }
        return arr3;
    }
}
