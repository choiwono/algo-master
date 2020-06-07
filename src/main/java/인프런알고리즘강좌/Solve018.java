package 인프런알고리즘강좌;

public class Solve018 {
    public static void main(String[] args) {
        int[] arr = {23,17,120,34,112,136,123,23,25,113};
        int answer = solution(10, 90, arr);
        System.out.println(answer);
    }

    public static int solution(int n, int m, int[] arr) {
        
        // 연속경보가 울렸을 때를 감지
        int answer = 0;
        int cnt = 0;
            
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > m) {
                cnt++;
            } else {
                if(answer < cnt) {
                    answer = cnt;
                }
                cnt = 0;
            }
        }

        return answer;
    }
}