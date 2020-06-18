package 인프런알고리즘강좌;

public class Solve024 {
    public static void main(String[] args) {
        solution(5, new int[]{1,4,2,3,7});
    }

    public static String solution(int N, int[] arr) {
        String answer = "YES";
        int max = N - 1;
        int[] arr1 = new int[max];
        int[] arr2 = new int[max];

        for(int i = 0; i < max; i++) {
            arr2[i] = i + 1;
        }

        for(int j = 0; j < N; j++) {
            if(j + 1 < N) {
                arr1[j] = arr[j] - arr[j+1];
            }
        }

        for(int k = 0; k < arr1.length; k++) {
            System.out.println(arr1[k]);
        }

        return answer;
    }
}