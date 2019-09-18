package 백준기초문제100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1463 {
    // d[n] = d[n-1] +1;
    // d[n] = d[n/3] +1;
    // d[n] = d[n/2] +1;
    private static int[] d;
    private static int dp(int k) {
        if(k <= 1) {
            d[k] = 0;
            return 0;
        }else if(k <= 3 && k > 1) {
            d[k] = 1;
            return d[k];
        }
        // memoization
        if(d[k] > 0) {
            return d[k];
        }

        d[k] = dp(k-1) +1;
        if(k % 2 ==0) {
            int temp =  dp(k/2) + 1;
            if(d[k] > temp) {
                d[k] = temp;
            }
        }

        if(k % 3 == 0) {
            int temp = dp(k/3) + 1;
            if(d[k] > temp) {
                d[k] = temp;
            }
        }
        return d[k];
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            d = new int[n+1];
            System.out.print(dp(n));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
