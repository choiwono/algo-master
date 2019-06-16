package 백준;

import java.util.*;

public class Backjoon1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
*/

        int answer = solution(1,2,3);
        System.out.println(answer);
    }
    // 나머지가 모두 1인 경우는 1일 제출..
    public static int solution(int E, int S, int M){
        int answer = 0;
        // 지구 태양 달
        // 1<=E<=15, 1<=S<=28, 1<=M<=19
        int e = 0;
        int s = 0;
        int m = 0;

        while(true){
            // 1++
            answer++;

            if((answer - E) % 15 == 0 && (answer - S) % 28 == 0 && (answer - M) % 19 == 0)
                break;
        }
        return answer;
    }
}
