package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Programmers12973 {
    public static void main(String[] args) {
        String s = "baabaa";
        int a = solution(s);
        System.out.println(a);
    }

    public static int solution(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);

        return stack.isEmpty() ? 1 : 0;
    }
}
