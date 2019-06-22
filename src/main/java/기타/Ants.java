package 기타;

import java.util.*;

public class Ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(), l, n;
        for(int i=0; i<tc; i++){
            l = sc.nextInt();
            n = sc.nextInt();
            int[] ants = new int[n];
            for(int j=0; j<n; j++){
                ants[j] = sc.nextInt();
            }
            int[] answer = solution(l,ants);
            System.out.println(answer[0]+" "+answer[1]);
        }
    }

    public static int[] solution(int n, int[] ants) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // 수학계산, 207 - 11, 207 - 12, 207 - 7
        int ant = ants[0];
        for (int i = 0; i < ants.length; i++){
            int antMin = Math.min(ant, n - ant);
            int antMax = Math.max(ant, n - ant);

            min = Math.max(min,antMin);
            max = Math.max(max,antMax);
        }
        return new int[]{min, max};
    }
}
