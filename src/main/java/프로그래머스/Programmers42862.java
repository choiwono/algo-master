package 프로그래머스;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Programmers42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        System.out.println(solution(n,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve){
        int answer = n - lost.length;
        // 잃어버린 놈 == 여분 가지고 있는놈은 제외해야됨
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -2;
                    reserve[j] = -2;
                }
            }
        }

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -2;
                }
            }
        }

        for(int i=0; i<lost.length; i++){
            if(lost[i] == -1 || lost[i] == -2){
                answer++;
            }
        }

        return answer;
    }
}
