package 프로그래머스;

import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();

        //int[] peoples = { 70, 50, 80, 50};
        int[] peoples = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        int answer = lifeBoat.solution(peoples,100);
        System.out.println(answer);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        // 내림차순 정렬
        // 작은수부터 차례로 정렬
        // 최대 2명씩 밖에 탈수없음..
        // 정렬 완료..
        // 50 50 70 80
        // 80 + 50 x 80 + 70 x 70 + 50 x 70 + 50 x 50 + 50 o
        Arrays.sort(people);
        int j = 0;
        for (int i = people.length - 1; i > 0; i--) {
            // System.out.println(i+":"+j);
            // if(j > i) break;
            if (people[i] + people[j] <= limit && j < i) {
                answer++;
                j++;
            }
        }

        return people.length - answer;
    }
}
