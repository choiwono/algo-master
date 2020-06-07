package 인프런알고리즘강좌;

public class Solve019 {
    public static void main(String[] args) {
        int[] arr = { 56,46,55,76,65,53,52,53,55,50 };
        int answer = solution(10, arr);
        System.out.println(answer);
    }

    public static int solution(int number, int[] arr) {
        int answer = 0;
        //int cnt = 0;
        // 10문제
        for(int i = 0; i < arr.length; i++) {
            boolean isMax = true;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    isMax = false;
                }   
            }
            if(i == arr.length - 1) break;
            if(isMax) answer++;
        }

        return answer;
    }
}