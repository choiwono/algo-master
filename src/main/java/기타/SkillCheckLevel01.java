package 기타;

public class SkillCheckLevel01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
    public static double solution(int[] arr){
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum / 4;
        return answer;
    }
}
