package 백준기초문제100;

import java.util.*;

public class Boj2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
