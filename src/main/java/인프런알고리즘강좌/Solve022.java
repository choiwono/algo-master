package 인프런알고리즘강좌;

public class Solve022 {
    public static void main(String[] args) {
        int N = 10;
        int K = 2;
        int[] arr = { 3, -2, -4, -9, 0, 3, 7, 13, 8, -3 };
        solution(N,K,arr);
    }

    public static int solution(int N, int K, int[] arr) {
        int max = 0;
        int answer = 0;
        // 숫자 제한을 둬서 둔 숫자만큼만 반복문을 돌린다.
        // 연속된 숫자만큼만 반복문 돌리기
        for(int i = 0; i < N - K; i++) {
            answer = 0;
            for(int j = i; j < i + K; j++) {
                answer = answer + arr[j];
            }
            if(answer > max) max = answer;
        }

        System.out.println(max);        
        return max;
    }
}