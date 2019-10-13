package 프로그래머스;

import java.util.*;

public class TargetNumber {
    
    static int answer = 0;

    public static void main(String[] args) {
        //System.out.println("aaa");
        int[] arr = {1,1,1,1,1};
        int target = 3;
        solution(arr,target);
        System.out.println(answer);
    }
    // dfs로 문제풀이..
    // 값을 찾을때마다 +씩 증가
    // numbers의 값이 + 한번, - 한번씩 나와야됨

    public static int solution(int[] numbers, int target){
        // 배열을 끝까지 돌려서 타겟값을 찾을경우 +1
        dfs(numbers,target,0,0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int index, int sum){
        // numbers 돌릴때마다 값을 체크
        if(index > numbers.length) return;
        if(index == numbers.length){
                answer++;
            }
            //return;
        } else {
            dfs(numbers, target, index+1, sum + numbers[index]);
            dfs(numbers, target, index+1, sum - numbers[index]);
        }
    }
}