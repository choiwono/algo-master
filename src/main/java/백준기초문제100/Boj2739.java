package 백준기초문제100;

import java.util.*;

public class Boj2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}
