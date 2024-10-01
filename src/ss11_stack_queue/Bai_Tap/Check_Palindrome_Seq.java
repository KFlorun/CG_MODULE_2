package ss11_stack_queue.Bai_Tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Check_Palindrome_Seq {
    public static void main(String[] args) {
        Stack<Character> str1 = new Stack<>();
        Queue<Character> str2 = new LinkedList<>();
        String s = "Able was I ere I saw Elba";
        s = s.replaceAll(" ", "").toLowerCase();
        for (char c: s.toCharArray()) {
            str1.push(c);
            str2.add(c);
        }
        boolean check = true;
        while(!str1.isEmpty()) {
            if (!str1.pop().equals(str2.remove())) {
                check = false;
            }
        }
        System.out.println(check);
    }
}
