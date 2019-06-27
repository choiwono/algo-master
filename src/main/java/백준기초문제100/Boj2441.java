package 백준기초문제100;

import java.util.*;

public class Boj2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = "";
        for(int i=0; i<a; i++){
            System.out.print(str);
            str += " ";
            for(int j=a-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
