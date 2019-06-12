package 백준;

import java.util.*;

public class Backjoon4307 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt(), K, N;

        for(int i=0; i<tc; i++){
            K = scan.nextInt();
            N = scan.nextInt();
            int[] ants = new int[N];

            for(int j=0; j<N; j++){
                ants[j] = scan.nextInt();
            }
            int[] answer = solution(N,K,ants);
            System.out.println(answer[0]+" "+answer[1]);
        }
    }

    public static int[] solution(int N, int K, int[] ants){
        //int[] answer = new int[2];
        int max = Math.max(K-ants[0],ants[0]);
        int min = Math.min(K-ants[0],ants[0]);

        for(int i=1; i<ants.length; i++){
            max = Math.max(max,Math.max(K-ants[i],ants[i])); // 8, 2
            min = Math.max(min,Math.min(K-ants[i],ants[i]));
        }
        return new int[]{min,max};
    }
}
