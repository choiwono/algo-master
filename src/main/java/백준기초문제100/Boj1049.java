package 백준기초문제100;

import java.util.*;

public class Boj1049 {
    static int N,M;
    static int[] set;
    static int[] unit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        set = new int[M];
        unit = new int[M];

        for(int i=0; i<M; i++){
            set[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }

        int answer = solution(N,set,unit);
        System.out.println(answer);
    }

    public static int solution(int target, int[] set, int[] unit){
        int answer = 0;

        // target 갯수를 살수있는 최소값
        // 개당 최소가격을 구해보자..
        // 단일로 6개 사는게 싼지, 세트로 사는게 싼지 비교
        // 6개 단위로 살때 어떤게 싼지 비교하고, 단일로 6개 이하 세트를 살때 세트가 오히려 가격이 낮을수도 있음
        Arrays.sort(set);
        Arrays.sort(unit);

        if(target < 6){
            answer += Math.min(set[0],unit[0] * target);
        } else {
            int temp = Math.min(set[0],unit[0] * 6);
            answer += (target / 6) * temp;
            answer += Math.min(temp,unit[0] * (target % 6));
        }

        return answer;
    }
}
