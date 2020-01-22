package 프로그래머스;

import java.util.*;

public class Programmers42583 {
    public static void main(String[] args) {
        int bride_length = 100;
        int weight = 100;
        //int[] truck_weights = {7,4,5,6};
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        Programmers42583 programmers = new Programmers42583();
        int answer = programmers.solution(bride_length,weight,truck_weights);
        System.out.println(answer);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        // 다리위에 트럭이 몇대있는지 알아야함.
        // 무게를 넘길수는 없음.
        // 초당 1씩 올라간다.
        Queue<Integer> truckQue = new LinkedList<>();
        Queue<Truck> bridgeQue = new LinkedList<>();
        // Truck truck = new Truck(0,0);
        for(int i=0; i<truck_weights.length; i++) {
            truckQue.add(truck_weights[i]);
        }

        // 트럭에 0, weight값을 넣었음
        // 다리 무게를 언제나 체크해야함
        int time = 0;
        int brideWeight = 0;
        while(true) {
            time++;
            // 트럭을 집어넣을수 있는 지 체크, 현재 다리무게를 알아야함.
            // 다리 길이랑 트럭의 현재 위치가 동일하면 트럭을 제외해야함
            if(!bridgeQue.isEmpty()) {
                if((time - bridgeQue.peek().getPosition()) == bridge_length) {
                    Truck tr = bridgeQue.poll();
                    //System.out.println(time+","+tr.weight+","+tr.getPosition());
                    brideWeight -= tr.getWeight();
                }
            }

            if(!truckQue.isEmpty()) {
                if(brideWeight + truckQue.peek() <= weight) {
                    int truck_weight = truckQue.poll();
                    System.out.println(time+","+truck_weight);
                    bridgeQue.add(new Truck(time,truck_weight));
                    brideWeight += truck_weight;
                }
            }

            // 종료조건, 트럭 과 다리가 모두 비었을 때
            if(bridgeQue.isEmpty() && truckQue.isEmpty()) {
                break;
            }
        }

        return time;
    }

    public class Truck {
        private int position;
        private int weight;
        
        public Truck(int position, int weight) {
            this.position = position;
            this.weight = weight;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getPosition() {
            return this.position;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return this.weight;
        }
    }
}
