package 인프런알고리즘강좌;

import java.util.*;

public class Solve008 {
    public static void main(String[] args) {
        String answer = solution("(()(()))(()");
    }

    public static String solution(String str) {
        String answer = "NO";
        Queue<String> que = new LinkedList<>();
        int cnt = 0;
        
        for(int i = 0; i<str.length(); i++) {
            que.add(String.valueOf(str.charAt(i)));            
        }
        
        while(!que.isEmpty()) {
            if(que.peek().equals("(")) {
                // 열린 괄호인 경우..
                System.out.println(que.poll());
                cnt++;
            } else if(que.peek().equals(")")) {
                // 닫힌 괄호인 경우..
                System.out.println(que.poll());
                cnt--;
            }
        }

        System.out.println(cnt);
        
        if(cnt == 0){ 
            answer = "YES";
        }

        return answer;
    } 
}