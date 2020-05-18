package 인프런알고리즘강좌;

public class Solve011 {
    public static void main(String[] args) {
        solution(4289);
    }

    public static int solution(int n) {
        int answer = 0, temp = 0, cnt = 0;

        for(int i=1; i<=n; i++) {
            temp = i;
            while(temp > 0) {
                temp = temp / 10;
                cnt++;
            }
        }
        System.out.println(cnt);
        return answer;
    }
}