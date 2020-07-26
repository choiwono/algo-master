package 인프런알고리즘강좌;

public class Solve026 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        // 8, 2 8 10 7 1 9 4 15
        // 1 1 1 3 5 2 5 1
        // 8과 10을 이길수 없으니 최종 3등
        int n = 8;
        int[] arr = { 2, 8, 10, 7, 1, 9, 4, 15 };
        // 
        int[] answer = new int[n];
        answer[0] = 1;
        
        for(int i = 1; i < n; i++) {
          int cnt = 0;
          for(int j = 0; j < i; j++) {
            if(arr[i] > arr[j]) {
                cnt++;
            }
          }
          answer[i] = i - cnt + 1;
        }

        for(int i=0; i<answer.length; i++) {
          System.out.println(answer[i]);
        }
    }   
}