package 백준기초문제100;

import java.util.*;

public class Backjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = sc.next().split("");
        int sum = 0;
        for(int i=0; i<str.length; i++){
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
