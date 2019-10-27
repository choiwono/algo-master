package 기타;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        int[] weights = {58,70,54,85,99,125,100,75,76,80,88,75}; 
        int answer = solution(300,12,weights);
        System.out.println(answer);
    }

    public static int solution(int limit, int cnt, int[] weights) {
        int answer = 0;
        // 딱 떨어지는 값을 찾아보자..
        /*int t = 0;
        int j = 0;
        int test = weights[j];
        for(int i=1; i<weights.length; i++){
            test += weights[j];
            if(test > limit){
                test = weights[j];
            }
            if(test == limit) t++; 
        }*/
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // limit 보다 weights 무게가 높은 경우 X
        for(int i=0; i<weights.length; i++) pq.add(weights[i]);
        
        int temp = 0;
        while(!pq.isEmpty()){
            if(pq.peek() > limit){ 
                answer = -1;
                break;
            }    

            temp += pq.peek();
            if(temp < limit){
                // 임시값이 리미트보다 작을경우..
               pq.poll();
            }

            if(temp >= limit){
                answer++;
                temp = pq.peek();
            }
        }

        return answer;
    }
}