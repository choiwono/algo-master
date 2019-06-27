package 백준기초문제100;

import java.util.*;

public class Boj9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int diff = 100 - N;
        if(diff <= 10){
            System.out.println("A");
        } else if(diff < 21){
            System.out.println("B");
        } else if(diff < 31){
            System.out.println("C");
        } else if(diff < 41){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
