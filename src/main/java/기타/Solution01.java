package 기타;

import java.util.Arrays;
import java.util.HashMap;

class Solution01 {
    public static void main(String[] args) {
        int[] s = solution(3,12);
        System.out.println(s[0]);
        System.out.println(s[1]);
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        int l = gcd * (n/gcd) * (m/gcd);
        answer[0] = gcd;
        answer[1] = l;
        return answer;
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
