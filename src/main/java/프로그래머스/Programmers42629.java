package 프로그래머스;

import java.util.*;

public class Programmers42629 {
    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;
        int answer = solution(stock,dates,supplies,k);
        System.out.println(answer);
    }

    public static int solution(int stock, int[] dates, int[] supplies, int k){
        int answer = 0;
        int index = 0;

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for(int i=0; i<k; i++){
            if(index < dates.length && dates[index] == i){
                q.add(supplies[index]);
                index++;
            }
            if(stock == 0) {
                stock += q.poll();
                answer++;
            }
            stock--;
        }
        return answer;
    }
}
