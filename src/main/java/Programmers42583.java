import java.util.*;

public class Programmers42583 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // 현재 다리위의 무게를 넘지 않는지 확인해야함
        // 다리에 진입할 때부터 이미 1초가 지나감
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> bride = new HashMap<>();
        for(int i : truck_weights) q.offer(i);
        int sum = 0;
        while(true){
            // 종료조건 다리위의 차량과 대기차량이 없을경우
            answer++; // 진입하자마자 1초증가

            if(bride.containsKey(answer))
                bride.remove(answer);

            sum = bride.values().stream().mapToInt(Number::intValue).sum();

            if(!q.isEmpty()){
                if(q.peek()+sum <= weight){
                    bride.put(answer+bridge_length,q.poll());
                }
            }

            if(q.isEmpty() && bride.isEmpty())
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = {7,4,5,6};
        int n = solution(bridgeLength,weight,truckWeights);
        System.out.println(n);
    }
}
