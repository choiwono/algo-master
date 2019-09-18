package 백준;

import java.util.LinkedList;
import java.util.Queue;

public class Backjoon16198 {
    static int[] arr = new int[]{1,2,3,4};
    public static void main(String[] args) {
        //boolean check[] = new boolean[4];
        System.out.println(solution());
    }

    public static int solution(){
        int answer = 0;

        boolean[] check = new boolean[arr.length]; // 0 1 2 3

        for(int i=1; i<arr.length-1; i++){
            if(!check[i]){// 1 2
                 // 1 2 3 4, 2을 골랐을 경우 1x3 = 3이 된 상태..
                int left = i - 1; // 0
                int right = i + 1; // 2
                while(check[left]) --left; // 체크한값은 X
                while(check[right]) ++right;

                check[i] = true;
                answer = Math.max(answer,solution() + arr[left] * arr[right]);
            }
        }
        return answer;
    }
}
