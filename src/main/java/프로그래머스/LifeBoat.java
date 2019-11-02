package 프로그래머스;

import java.util.PriorityQueue;

public class LifeBoat {
    public static void main(String[] args) {
        //int[] peoples = {50,50,70,80};
        int[] peoples = {10,20,30,40,50,60,70,80,90};
        //int[] peoples = {70, 80, 50};
        int limit = 100;
        LifeBoat lifeBoat = new LifeBoat();
        int answer = lifeBoat.solution(peoples,limit);
        System.out.println(answer);
    }

    // 정령를 먼저 하자..
    // 정렬 순서대로 배에 태우고, 임시값에 저장
    // limit값을 넘어갈 경우 answer ++ 아닐 경우에는 계속 태우자..

    public int solution(int[] people, int limit){
        int answer = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<people.length; i++){
            pq.add(people[i]);
        }

        int temp = pq.poll();
        int cnt = 1;

        // 보트에는 최대 두명만 탈수있음..
        while(!pq.isEmpty()){
            // 보트에 탈수있는 사람은 최대 2명.. 생각해야함

        }
        return answer;
    }
}
