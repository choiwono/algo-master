package 백준;

import java.util.*;

public class Backjoon11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        /*int N = 5;
        int[] arr = {3,1,4,3,2};*/
        System.out.println(solution(N,arr));
    }

    public static int solution(int N, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        // 1 2 3 3 4
        // 1 + 3 + 6 + 9 + 13
        int cnt = 0;
        for(int i=0; i<N; i++) {
            cnt += arr[i]; // 1, + 1 + 2,
            answer += cnt;
        }
        return answer;
    }
}
