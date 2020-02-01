package 프로그래머스;

public class Programmers42895 {
    static int answer = -1;
    public static void main(String[] args) {
        solution(5,12);
    }

    public static int solution(int N, int number){
        // DFS로 사칙연산.. 최솟값이 8보다 크면 -1을 RETURN 한다.
        // DFS로 모든 경우의 수를 계산한다.
        dfs(N, number, 0, 0);

        return answer;
    }

    public static void dfs(int N, int number, int cnt, int prev) {
        // N = 기본값, NUMBER 만들어야할 숫자
        int temp_N = N;
        if (cnt > 8) {
            answer = -1;
            return;
        }
        // 종료조건, number값과 합계가 같을경우
        if(number == prev) {
            if (answer == -1 || answer > cnt) {
                answer = cnt;
                return;
            }
        }
        
        for(int i=0; i<8-cnt; i++) {
            dfs(N, number, cnt+i+1, prev-temp_N);
            dfs(N, number, cnt+i+1, prev+temp_N);
            dfs(N, number, cnt+i+1, prev*temp_N);
            dfs(N, number, cnt+i+1, prev/temp_N);

            temp_N = increaseNumber(temp_N, N);
        }
    }

    public static int increaseNumber(int value, int N) {
        return value * 10 + N;
    }
}
