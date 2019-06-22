package 기타;

public class JumpOver {
    public static void main(String[] args) {
        solution(4);
    }

    public static long solution(int n){
        //long answer = 0;
        int[] arr = new int[2000];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 5;

        for(int i=3; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
