import java.util.*;

public class Programmers42626 {

    public static int solution(int[] scoville, int K) {

        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i : scoville){ q.offer(i); }

        while(true){
            if(q.size() < 2 || q.peek() <= K){
                answer = -1;
                break;
            }

            if(q.peek() >= K){
                break;
            }

            int temp = q.poll() + q.poll() * 2;
            q.offer(temp);
            answer++;
        }

        return answer;
    }
}
