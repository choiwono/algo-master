package 백준기초문제100;

import java.util.*;

public class Boj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] arr = new int[X];

        for(int i=0; i<X; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<X; i++){
            if(arr[i] < Y){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
