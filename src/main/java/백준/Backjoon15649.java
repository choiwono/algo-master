package 백준;

import java.util.*;

public class Backjoon15649 {
    static boolean[] c = new boolean[10]; // boolean check
    static int[] a = new int[10]; // int 배열

    public static void go(int index, int n, int m){
        if(index == m){
            for(int i=0; i<m; i++){
                System.out.print(a[i]);
                if(i != m-1) System.out.print(' ');
            }
            System.out.println();
            return; // 정답을 찾은경우!!
        }
        for(int i=1; i<=n; i++){
            if (c[i]) continue;
            c[i] = true; // 한번 방문하면 true
            a[index] = i;
            go(index+1,n,m);
            c[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(0,n,m);
    }
}
