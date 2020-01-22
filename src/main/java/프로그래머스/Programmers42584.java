package 프로그래머스;

import java.util.*;

public class Programmers42584 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        int[] answer = solution(arr);

        for(int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] numbers){
        
        int[] answer = new int[numbers.length];

        // 0부터 시작
        int index = 0;
        int temp = 0;

        while(true) {
            for(int i=index+1; i<numbers.length; i++) {
                if(numbers[index] <= numbers[i]) {
                    temp++;
                } else {
                    temp++;
                    break;
                }
            }
            answer[index] = temp;
            
            temp = 0;
            index++;

            if(index == numbers.length - 1) {
                answer[index] = 0;
                break;
            }
        }
 
        return answer;
    }
}