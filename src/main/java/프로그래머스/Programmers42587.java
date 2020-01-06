package 프로그래머스;

import java.util.*;

public class Programmers42587 {
    public int solution(int[] priorities, int location){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pointer> q = new LinkedList<>();

        int answer = 0;

        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
            q.add(new Pointer(i, priorities[i]));
        }
        
        while(!pq.isEmpty()){
            int prior = pq.peek().intValue();
            pq.poll();

            //int n = 1;
            int n;
            while(true) {
                n = q.peek().x;         // 원소 순서
                int nPrior = q.peek().y;    // 우선 순위
                q.poll();

                if(nPrior == prior) {
                    break;
                }

                q.add(new Pointer(n, nPrior));
            }
            answer++;

            if(n==location) {
                break;
            }
        }

        return answer;
    }

    class Pointer {
        int x;
        int y;
        public Pointer(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[] priority = {1,1,9,1,1,1};
        //int[] priority = {2,1,3,2};
        int location = 0;
        Programmers42587 programmers = new Programmers42587();
        int solution = programmers.solution(priority,location);
        System.out.println(solution);
    }
}
