package 프로그래머스;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Programmers42583 {
    public static void main(String[] args) {
        int bride_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        int answer = solution(bride_length,weight,truck_weights);
        System.out.println(answer);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        int bridge_weight = 0;

        // 길이가 2, 10kg를 견디는 다리가 있을 때 모든 트럭이 다리를 지나는 시간을 구할것
        Queue<Integer> truckQ = new LinkedList<>();
        HashMap<Integer,Integer> brideMap = new HashMap<>();

        for(int i=0; i<truck_weights.length; i++)
            truckQ.offer(truck_weights[i]);
        // 7,4,5,6
        while(true){
            answer++;

            if(brideMap.containsKey(answer)){
                brideMap.remove(answer);
            }

            bridge_weight = brideMap.values().stream().mapToInt(Number::intValue).sum();

            if (truckQ.size() > 0) {
                if(bridge_weight + truckQ.peek() <= weight) {
                    brideMap.put(answer + bridge_length, truckQ.poll());
                }
            }

            if(truckQ.isEmpty() && brideMap.isEmpty()){
                break;
            }
        }
        return answer;
    }
}
