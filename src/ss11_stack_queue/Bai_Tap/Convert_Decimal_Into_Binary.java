package ss11_stack_queue.Bai_Tap;

import java.util.Scanner;
import java.util.Stack;

public class Convert_Decimal_Into_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        Stack<Integer> binary = new Stack<>();
        do {
            int remainder = decimal % 2;
            binary.push(remainder);
            decimal /= 2;
        } while (decimal != 0);
        while(!binary.isEmpty()) {
            System.out.print(binary.pop() + " ");
        }
    }

}
