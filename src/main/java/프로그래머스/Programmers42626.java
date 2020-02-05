package 프로그래머스;

import java.util.*;

public class Programmers42626 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        int answer = solution(arr, 7);
        System.out.println(answer);
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        // k 보다 작은 음식 2개 섞고 모두 체크..
        // 이상이 없을 경우 리턴, 아닐경우 ++
        PriorityQueue<Integer> scovilleFood = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++) {
            scovilleFood.add(scoville[i]);
        }

        while(true) {
            // K 보다 작을경우 섞어서 다시 집어넣는다.
            if(scovilleFood.peek() < K) {
                answer++;
                int mix = scovilleFood.poll() + ( scovilleFood.poll() * 2 );
                scovilleFood.add(mix);
            
            } else {
                return answer;
            }

            if(scovilleFood.size() == 2 && scovilleFood.peek() < K) {
                return -1;
            }
        }
    }
}
