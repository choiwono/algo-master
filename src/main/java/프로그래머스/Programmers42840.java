package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers42840 {
    public static void main(String[] args) {
        // 수포자 문제
        int[] answers = {1,2,3,4,5};
        //int[] answers = {1,3,2,4,2};
        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers){
        int[] answer = new int[3]; // 1 3 2 4 2
        int[][] maths = {{1,2,3,4,5,1,2,3,4,5},{2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}};

        int maxNum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<answers.length; i++){
            if(answers[i] == maths[0][i % 5]){
                answer[0]++;
            }
            if(answers[i] == maths[1][i % 8]){
                answer[1]++;
            }
            if(answers[i] == maths[2][i % 10]){
                answer[2]++;
            }
        }

        maxNum = Math.max(answer[0],Math.max(answer[1],answer[2]));

        for(int i=0; i<3; i++){
            if(answer[i] == maxNum){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
