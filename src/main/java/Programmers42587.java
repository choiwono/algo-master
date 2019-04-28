import java.util.*;

public class Programmers42587 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> q = new LinkedList<>();
        LinkedList<Integer> prior = new LinkedList<>();

        for(int i=0; i<priorities.length; i++){
            q.offer(i);
            prior.add(priorities[i]);
        }

        Collections.sort(prior);

        while(!q.isEmpty()){
            if(priorities[q.peek()] == prior.peekLast()){
                if(q.peek() == location){ // 3
                    return answer;
                } else {
                    q.poll();
                    prior.removeLast();
                    answer++;
                }
            } else {
                q.offer(q.poll());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priority = {1,1,9,1,1,1};
        int location = 2;
        System.out.println(solution(priority,location));
    }
}
