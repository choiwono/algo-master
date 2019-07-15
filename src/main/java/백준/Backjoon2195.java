package 백준;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon2195 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 첫잔일 경우
        if(N >= 1){ // 100
            dp[0] = arr[0];
        }
        // 두잔일 경우
        if(N >= 2){ // 500
            dp[1] = arr[0] + arr[1];
        }
        // 세잔일 경우
        if(N >= 3){ // 500, 102, 402랑 비교
            dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1] + arr[2]));
        }
        // dp가 4일 경우..
        // dp[3] = Math.max(dp[3-1], Math.max(dp[3-2] + arr[3], dp[3-3] + arr[3-1] + arr[3]));

        for(int i = 3; i < N; i++){
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }
        System.out.println(dp[N - 1]);
    }
}
