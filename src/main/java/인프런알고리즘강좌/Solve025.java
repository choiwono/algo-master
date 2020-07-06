package 인프런알고리즘강좌;

public class Solve025 {
    public static void main(String[] args) {
        solution(5, new int[]{90, 85, 92, 95, 90});
    }

    public static int[] solution(int N, int[] arr) {
        int[] answer = new int[N];
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        for(int i=1; i<=N; i++) {
            a[i] = arr[i-1];
            b[i] = 1;
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(a[j] > a[i]) b[i]++;
            }
        }

        for(int i=1; i<=N; i++) {
            System.out.println(b[i]);
        }
        //int n = 1;
        //int cnt = 0;
        // 0 : 90, 85 : 1, 92 : 2, 95 : 3, 90 : 4
        /*for(int i=100; i>0; i--) {
            boolean flag = false;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] == i) {
                    answer[j] = n;
                    cnt++;
                    flag = true;
                    System.out.println(cnt);
                }
            }

            if(flag) n++;
        }*/       
        
        /*for(int i=0; i<N; i++) {
            System.out.println(answer[i]);
        }*/

        return answer;
    }
}