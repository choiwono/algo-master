package 백준기초문제100;

import java.util.*;

public class Backjoon1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a,b));
    }

    public static int solution(int a, int b){
        return a - b;
    }
}
