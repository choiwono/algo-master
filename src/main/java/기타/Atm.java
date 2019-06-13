package 기타;

import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = scanner.nextInt();
        solution(N,arr);
    }

    public static int solution(int N, int[] arr){
        int answer = 0;

        Arrays.sort(arr);
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            temp += arr[i];
            answer += temp;
        }
        return answer;
    }
}
