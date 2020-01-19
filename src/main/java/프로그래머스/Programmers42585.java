package 프로그래머스;
import java.util.*;

public class Programmers42585 {
    /* 
        1. "(" 일 경우 num++
        2. ")"가 나올경우 nun가 1이고 다음 +1값이 "(" 경우 num값 초기화
        3. ")"가 나왔는데 num값이 1보다 클 경우 count에 저장 후 num 초기화
        4. 
    */
    public static int solution(String arrangment) {
        int answer = 0;
        String str = arrangment;
        Stack<Character> stack = new Stack();
        //
        for(int i=0; i<str.length(); i++) {
            
            if(str.charAt(i) == '(') {
                stack.add('(');        


            } else if(str.charAt(i) == ')') {
                stack.pop();
                if(str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else if(str.charAt(i - 1) == ')') {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution("()(((()())(())()))(())");
        System.out.println(answer);
    }
}