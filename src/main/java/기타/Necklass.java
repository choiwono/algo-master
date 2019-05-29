package 기타;

import java.util.Scanner;

public class Necklass {
    public static void main(String[] args) {
        int[] arr = {5,4,0,3,1,6,2};
        //int[] arr = {3,5,2,1,0,6,4};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A){
        int count = 0;
        for(int i=0; i<A.length; i++){
            int B = A[i];
            for(int j=0; j<A.length; j++) {
                if(i==j) continue;
                if (A[B] == j) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
