package 프로그래머스;

import java.util.*;

public class Programmers42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 우선순위 큐에 값을 넣으면
        // 내림차순, 원래는 오름차순임 ㅎ
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<pointer> q = new LinkedList<>();
        // 오름차순 대로 값이 들어가있는 큐 ex) 9 1 1 1 1 1
        for(int i = 0; i<priorities.length; i++){
            pq.offer(priorities[i]); // 오름차순으로 정렬될 것이다.
            q.offer(new pointer(i,priorities[i]));
        }
        int order = 1;
        while(!q.isEmpty()) {
            int prior = pq.peek().intValue();
            pq.poll();

            int n;
            while(true) {
                n = q.peek().x;         // 원소 순서
                int nPrior = q.peek().y;    // 우선 순위
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
