package 백준;

import java.util.LinkedList;
import java.util.Queue;

public class Backjoon16198 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        //boolean check[] = new boolean[4];
        solution(arr);
    }

    public static int solution(int[] arr){
        int answer = 0;
        //Queue<Integer> que = new LinkedList<>();
        // 1 2 3 4
        boolean[] check = new boolean[arr.length]; // 0 1 2 3
        // 0 1
        /*for(int i=0; i<arr.length; i++)
            que.add(arr[i]);*/

        //while(true){
        //int sum = 0;
        for(int i=1; i<arr.length-1; i++){
            if(!check[i]){// 1 2
                 // 1 2 3 4, 2을 골랐을 경우 1x3 = 3이 된 상태..
                int left = i - 1; // 0
                int right = i + 1; // 2
                while(check[left]) --left; // 체크한값은 X
                while(check[right]) ++right;

                check[i] = true;
                // 0 + 1*3 = 3
                // 3
                // 1*4 = 4
                // 0, 0+3
                // 3, 3 + 4 7 , 7
                // 7
                answer = Math.max(answer,answer + arr[left] * arr[right]);
            }
        }
        return answer;
    }
}
