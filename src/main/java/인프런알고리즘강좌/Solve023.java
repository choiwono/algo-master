package 인프런알고리즘강좌;

import java.util.*;

public class Solve023 {
    public static void main(String[] args) {
        solution(9, new int[]{5,7,3,3,12,12,13,10,11});
    }

    public static int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;
        int cnt = 1;
        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<n; i++) {
            que.add(arr[i]);
        }

        while(!que.isEmpty()) {
            if(max <= que.peek()) {
                cnt++;
            } else {
                cnt = 1;
            }
            max = que.poll();
            
            answer = Math.max(answer, cnt);
        }
        //System.out.println(answer);

        return answer;
    }
}