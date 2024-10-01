package ss3_Array_Method.Thuc_Hanh;

import java.util.Scanner;

public class Find_Index_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println("Enter name you want to find");
        String name = sc.nextLine().toUpperCase();
        int index = 0;
        for (String item : arr) {
            if (item.equals(name)) {
                System.out.println(index);
            }
            index++;
        }
    }
}
