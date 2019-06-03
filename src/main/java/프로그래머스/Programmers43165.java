package 프로그래머스;

public class Programmers43165 {
    static int ANSWER = 0;

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        // 모든 경우의 수 구하기
        // dfs 문제
    }

    public int solution(int[] numbers, int target){
        dfs(numbers, target, 0);
        return ANSWER;
    }

    public void dfs(int[] numbers, int target, int k){
        // 종료조건 ..
        if(k == numbers.length){
            int sum = 0;
            //합계를 구해야됨..
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
            }
            if(sum == target){
                ANSWER++;
            }
        }

        numbers[k] *= 1;
        dfs(numbers, target, k+1);

        numbers[k] *= -1;
        dfs(numbers, target, k+1);
        // 매번 안에 있는 numbers의 값을 +1, -1로 변경해야함.. 넘버즈의 값을 바꿔야한다.
        // 합계가 target 넘버와 일치할 경우 answer값을 늘려주자..
    }
}
