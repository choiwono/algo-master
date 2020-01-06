package 인프런알고리즘강좌;

import java.util.*;

public class PlusOne{
    // { 1,2,3 } + 1 하기 문제
    // { 9,9,9} 일 경우 1,0,0,0이 된다.
    public static void main(String[] args) {
        //int[] digits = {9,9,9};
        int[] digits = {1,2,3};
        int[] result = solution(digits);
        for( int i : result ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr){
        for( int i = arr.length - 1; i >= 0; i-- ){
            if( arr[i] == 9 ){
                arr[i] = 0;
            } else {
                arr[i]++;
                break;
            }
        }

        if( arr[0] == 0 ){
            int[] result = new int[ arr.length + 1 ];
            result[0] = 1;
            return result;
        }

        return arr;
    }
}
