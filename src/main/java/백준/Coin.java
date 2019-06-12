package 백준;

import java.util.*;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N = sc.nextInt(), K = sc.nextInt();
        int arr[] = new int[N];

        for(i=0; i<N; i++) arr[i] = sc.nextInt();
        /*int arr[] = {1,5,10,50,100,500,1000,5000,10000,50000};*/
        int answer = solution(N,K,arr);
        System.out.println(answer);
    }

    public static int solution(int N, int K, int[] arr){
        int answer = 0, index = arr.length - 1;

        while(true){
            if(K == 0){
                break;
            }

            if(K % arr[index] != 0 && K >= arr[index]){
                answer += K / arr[index];
                K = K % arr[index];
            } else if(K % arr[index] == 0){
                return answer + K / arr[index];
            }
            index--;
        }
        return answer;
    }
}
