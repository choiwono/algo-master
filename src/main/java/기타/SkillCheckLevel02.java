package 기타;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SkillCheckLevel02 {
    public static void main(String[] args) {
        int[] r = {1,2,3,9,10,12};
        int answer = solution(r,7);
        System.out.println(answer);
    }

    public static int solution(int[] scoville, int K){
        int answer = 0;
        Arrays.sort(scoville);
        // 정렬시키고
        Queue<Integer> q = new LinkedList<>();
        for(int i : scoville){ q.offer(i); }
        // 1, 2, 3, 9, 10, 12
        //int cnt = 0;
        while(true){
            if(q.peek() < K){
                int temp = q.poll() + q.poll() * 2;
                q.offer(temp);
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
