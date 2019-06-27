package 백준기초문제100;

import java.util.*;

public class Boj10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a,b,c;
        int[] arr = new int[3];

        for(int i=0; i<3; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
