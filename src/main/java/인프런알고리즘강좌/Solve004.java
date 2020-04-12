package 인프런알고리즘강좌;

public class Solve004 {
    public static void main(String[] args) {
        int[] arr = { 13,15,34,23,45,65,33,11,26,42 };
        solution(10, arr);
    }

    public static int solution(int n, int[] arr) {
        int max = 0;
        int min = arr[0];
        
        for(int i = 0 ; i < arr.length; i++ ) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        return max-min;
    }
}