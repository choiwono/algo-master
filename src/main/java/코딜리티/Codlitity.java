package 코딜리티;

public class Codlitity {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int N = A.length;
        int leftSum = 0;
        int rightSum = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            sum += A[i];
        }

        for(int x = 1 ; x < N ; x++){
            leftSum += A[x - 1];
            rightSum = sum - leftSum;
            minDiff = Math.min(minDiff, Math.abs(leftSum - rightSum));
        }
        return minDiff;
    }
}
