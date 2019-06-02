package 프로그래머스;

public class Programmers43165 {
    static int ANSWER = 0;

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        Programmers43165 programmers = new Programmers43165();
        programmers.solution(numbers,target);
    }

    public int solution(int[] numbers, int target){
        permutation(numbers, target, 0);
        return ANSWER;
    }

    public void permutation(int[] numbers, int target, int k){
        // 모든 경우의 수 = dfs
        // 재귀함수일 경우 한번 도는 시점에서 모든 경우의 수를 더하고, k값이 증가되야함.
        if(k == numbers.length){
            int sum = 0;
            for(int i = 0;i<numbers.length;i++){
                sum += numbers[i];
            }
            if(sum == target)
                ANSWER++;
            return;
        } else {
            numbers[k] *= 1;
            permutation(numbers,target,k+1);

            numbers[k] *= -1;
            permutation(numbers,target,k+1);
        }
    }
}
