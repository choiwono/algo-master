package 릿코드;

import java.util.*;

public class MovesToZeros {
    public static void main(String[] args) {
        //solution("try  hello   world");
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
    
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                continue;
            } else {
                nums[idx] = nums[i];
                idx++;
            }
        }
        
        for(int j=idx; j<nums.length; j++) {
            nums[j] = 0;
        }
    }

}