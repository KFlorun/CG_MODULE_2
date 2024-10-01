package ss11_stack_queue.Bai_Tap;

import java.util.Scanner;
import java.util.Stack;

public class Check_Sym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> c = new Stack<>();
        s = s.replaceAll(" ", "") ;
        boolean check = true;
        for (char symbol: s.toCharArray()) {
            if (symbol == '(') {
                c.push(symbol);
            } else if (symbol == ')') {
                if (c.isEmpty()) {
                    check = false;
                    break;
                }
                c.pop();
            }
        }
        System.out.println(check);
    }
}
