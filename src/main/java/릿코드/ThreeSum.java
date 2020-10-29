package 릿코드;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
      // 3개의 숫자합계가 0이 되야하므로 그이하 길이의 배열은 리턴
      if(nums.length < 3) return new ArrayList<>();
      // 결과값 때문에 정렬
      Arrays.sort(nums);

      Set<List<Integer>> set = new HashSet<>();
      
      for(int i=0; i < nums.length - 2; i++) {
        int j = i + 1;
        int k = nums.length - 1;
        while(j < k) {
          System.out.println("i="+i+", j="+j+", k="+k);
          int sum = nums[i] + nums[j] + nums[k];
          if (sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
          else if (sum > 0) k--;
          else if (sum < 0) j++;
        }
      }

      return new ArrayList<>();
    }
}