package 백준기초문제100;

import java.util.*;

public class Boj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String star = "";
        String space = "";

        for(int i=1; i<=N; i++){
            for(int j=N-i; j>0; j--){
                System.out.print(" ");
            }
            star += "*";
            System.out.print(star);
            System.out.println();
        }
    }
}
