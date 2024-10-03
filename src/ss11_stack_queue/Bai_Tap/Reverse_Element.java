package ss11_stack_queue.Bai_Tap;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Element {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> newArr = new Stack<>();
        for (int i = 0; i < 5; i++) {
            arr.push(sc.nextInt());
        }
        while (!arr.isEmpty()) {
            newArr.push(arr.pop());
        }
        System.out.println(newArr);
    }

}
