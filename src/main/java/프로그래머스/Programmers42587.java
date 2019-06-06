package 프로그래머스;

import java.util.*;

public class Programmers42587 {
    public int solution(int[] priorities, int location){
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<pointer> q = new LinkedList<>();

        for(int i = 0; i<priorities.length; i++){
            pq.offer(priorities[i]);
            q.offer(new pointer(i,priorities[i]));
        }

        while(!q.isEmpty()) {
            int prior = pq.peek().intValue();
            pq.poll();

            int n;
            while(true) {
                n = q.peek().x;
                int nPrior = q.peek().y;
                q.poll();

                if(nPrior == prior) {
                    break;
                }

                q.add(new pointer(n, nPrior));
            }
            answer++;
            if(n==location) {
                break;
            }
        }
        return answer;
    }

    class pointer{
        int x;
        int y;
        public pointer(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[] priority = {1,1,9,1,1,1};
        int location = 0;
        Programmers42587 programers = new Programmers42587();
        System.out.println(programers.solution(priority,location));
    }
}
