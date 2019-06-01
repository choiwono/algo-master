package 프로그래머스;

import java.util.*;

public class Programmers42583 {
    public static void main(String[] args) {
        int bride_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        //int answer = solution(bride_length,weight,truck_weights);
        Programmers42583 program = new Programmers42583();
        int answer = program.solution(bride_length,weight,truck_weights);
        System.out.println(answer);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        int bridge_weight = 0;
        List<Truck> bridgeList = new ArrayList<>();
        Queue<Integer> truckQ = new LinkedList<>();

        // 트럭은 1초에 1만큼 움직인다.
        // 다리길이는 bride_length이고, 무게는 weight까지 견딘다.
        // 다리안에 트럭의 시간을 체크해서 bride_length와 동일하면 제외.
        // 순서대로 넣자
        for(int i=0; i<truck_weights.length; i++)
            truckQ.offer(truck_weights[i]);

        while(true){
            answer++;

            for(int i=0; i<bridgeList.size(); i++){
                if(bridgeList.get(i).getDistance() == answer){
                    bridgeList.remove(i);
                }
            }

            bridge_weight = bridgeList.stream().mapToInt(f -> f.getWeight()).sum();

            if(truckQ.size() > 0) {
                if (truckQ.peek() + bridge_weight <= weight) {
                    bridgeList.add(new Truck(truckQ.poll(), answer + bridge_length));
                }
            }

            if(truckQ.isEmpty() && bridgeList.size() == 0){
                break;
            }
        }
        return answer;
    }

    public class Truck {
        private int weight;
        private int distance;

        public Truck(int weight, int distance){
            this.weight = weight;
            this.distance = distance;
        }

        public int getWeight(){
            return this.weight;
        }

        public int getDistance(){
            return this.distance;
        }
    }
}
