package 릿코드;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
    
    public static int maxArea(int[] height) {
        int answer = 0;
    
        for(int i=0; i < height.length; i++) {
          for(int j=i+1; j < height.length; j++) {
              answer = Math.max(answer, Math.min(height[i], height[j]) * (j - i));
          }
        }
        return answer;   
    }
}