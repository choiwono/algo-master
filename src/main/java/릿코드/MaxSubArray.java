package 릿코드;

import java.util.*;

public class MaxSubArray {
    public static void main(String[] args){
        int[] arr = {-1,-2,-3,-4,-5};
        maxSubArray(arr);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                System.out.println("sum:"+sum+", nums[j]:"+nums[j]);
                System.out.println("maxSum:"+maxSum);
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }
}