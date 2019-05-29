package 기타;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] outPut = new int[n];
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++)
            arr[i] = i+1;
        perm(arr, outPut, visited, 0, n, n);

    }

    private static void perm(int[] arr, int[] outPut, boolean[] visited, int depth, int n, int r) {
        if(depth == r){
            print(outPut, r);
            return;
        }

        for(int i=0; i<n; i++){
            if(visited[i] != true){
                visited[i] = true;
                outPut[depth] = arr[i];
                perm(arr, outPut, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    private static void print(int[] arr, int r) {
        for(int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
