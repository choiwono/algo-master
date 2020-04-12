package 인프런알고리즘강좌;

public class Solve001 {
    public static void main(String[] args) {
        int answer = solution(15,3);
        System.out.println(answer);
    }
    // 자연수의 합
    public static int solution(int n, int m) {
        int answer = 0;

        for(int i=1; i <= n; i++) {
            if(i % m == 0) {
                answer = answer + i;
            }
        }

        return answer;
    }
}