package 프로그래머스;

import java.util.*;

public class Programmers42586 {
    public static void main(String[] args) {
        int[] progress = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5, 10, 7};
        int[] result = solution(progress,speeds);
        for(int i : result){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds){

        List<Integer> list = new ArrayList<>();
        Queue<Integer> dayQue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++){
            int day = (100 - progresses[i]) / speeds[i];
            if((100-progresses[i]) % speeds[i] > 0){
                day++;
            }
            dayQue.offer(day);
        }
        int cnt = 1;
        int head = dayQue.poll();
        while(true){
            int num = dayQue.poll();
            if(num <= head){
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
                head = num;
            }
            if(dayQue.isEmpty()){
                break;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
