package 기타;

import java.util.Stack;

public class PairRemove {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }

    public static int solution(String s){

        Stack<Character> stack = new Stack<>();
        char[] strings = s.toCharArray();

        for(int i = 0; i<strings.length; i++){
            if(stack.isEmpty()){
                stack.push(strings[i]);
            } else {
                if(stack.peek().equals(strings[i])){
                    stack.pop();
                }
            }
        }
        //System.out.println(stack.size());
        // for문 다 돌았는데 스택이 비었으면 1, 아니면 0
        return stack.size() == 0 ? 1 : 0;
    }
}
