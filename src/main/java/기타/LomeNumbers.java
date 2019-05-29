package 기타;

import java.util.*;

public class LomeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[50*20+1];
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                for(int k=0; k<=n-i-j; k++){
                    int l = n-i-j-k;
                    int sum = i+j*5+k*10+l*50;
                    check[sum] = true;
                }
            }
        }
        int ans = 0;
        for(int i=1; i<=50*20; i++){
            if(check[i]) ans += 1;
        }
        System.out.println(ans);
    }
}
