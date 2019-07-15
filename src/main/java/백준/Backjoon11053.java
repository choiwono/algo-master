package 백준;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Backjoon11053 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,10,30,20,50};
        solution(arr);
    }

    public static int solution(int[] arr){
        int answer = 0;

        // 큐에 모든 숫자를 기입하자!!
        // 수열에 있는 수를 비교하는 방법은..?
        // 인덱스값이 하나 필요
        // 비교한값중에 가장 앞에 있는 값을 찾아야함..
        // 동일한 숫자일 경우 앞에 있는 숫자를 가져가야됨..

        int arrIndex = 0;
        int index = 1;

        while(true) {
            if(arr.length == arrIndex){
                break;
            }
            if(arr.length == index){
                arrIndex++;
                index = arrIndex+1;
            }

            int temp = arr[index] - arr[arrIndex];

            index++;
            if(arr[index] - arr[arrIndex] < temp) {
                temp = arr[index] - arr[arrIndex];
                answer++;
            }
        }

        return answer;
    }
}
