package 프로그래머스;

import java.util.*;

public class Programmers42588 {
    public static void main(String[] args) {
        //int[] heights = {6,9,5,7,4};
        int[] heights = {3,9,9,3,5,7,2};
        int[] answer = solution(heights);
        for(int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        // 수신값이 없을경우 0으로 처리
        /*Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<heights.length; i++) {
            stack.push()
        }*/
        int index = heights.length - 1;
        int num = index - 1;
        // 탑의 위치는 index + 1
        for(int i=index; i>=0; i--) {
            // 숫자가 뒤부터 뺴서 크면 넣어
            for(int j=num; j>= 0; j--) {
                if(heights[i] < heights[j]) {
                    System.out.println(i+","+j);
                    answer[i] = j + 1;
                    break;
                } else {
                    continue;
                }
            }
            num--;
        }

        
        return answer;
    } 
}