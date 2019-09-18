package 백준기초문제100;

import java.util.*;

public class Boj2839 {
    // 5kg로만 옮길수 있는 경우..
    // 5kg + 3kg로 옮길수 있는 경우..
    // 3kg로만 옮길수 있는 경우..

    public static void main(String[] args) {
        // 경우의 수..
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int count = 0;

        if (n % 5 == 0) {
            System.out.println(n / 5);
            return;
        } else if(n % 5 > 0){
            for (int i = 1; i <= 1000; i++) {
                count = n - (i * 5);
                if (count % 3 == 0) {
                    answer = i + (count / 3);
                    System.out.println(answer);
                    return;
                }
            }
        }
        if(n % 3 == 0) {
            System.out.println(n / 3);
            return;
        }
        System.out.println(-1);
    }
}
