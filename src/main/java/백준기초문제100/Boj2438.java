package 백준기초문제100;

import java.util.*;

public class Boj2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String star = "";
        for(int i=1; i<=N; i++) {
            star += "*";
            System.out.println(star);
        }
    }
}
