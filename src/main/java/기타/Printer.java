package 기타;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int[] priority = {2,1,3,2};
        int location = 2;
        Printer printer = new Printer();
        printer.solution(priority,location);
    }
    public int solution(int[] priority, int location){
        // 내림차순 정렬
        // 3 2 2 1
        PriorityQueue<Integer> priorQue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pair> que = new LinkedList<>();
        for(int i=0; i<priority.length; i++) {
            priorQue.offer(priority[i]);
            que.offer(new Pair(priority[i],i));
        }

        return 0;
    }

    class Pair {
        private int prior;
        private int location;

        public Pair(int prior,int location){
            this.prior = prior;
            this.location = location;
        }
    }
}
