package ss3_array_method.Bai_Tap;

import java.util.Scanner;

public class Count_Char_In_Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter a char to count: ");
        char check = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check == s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
