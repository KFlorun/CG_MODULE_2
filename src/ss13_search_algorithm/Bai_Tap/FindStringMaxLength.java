package ss13_search_algorithm.Bai_Tap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindStringMaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Queue<Character> ans = new LinkedList<>();
        ans.add(arr[0]);
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length + 1; i++) {
            if (arr[i + 1] > arr[i]) {
                ans.add(arr[i + 1]);
            }
        }
        System.out.println(ans);
    }
}
