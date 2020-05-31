package 인프런알고리즘강좌;

public class Solve015 {
    public static void main(String[] args) {
        solution(20);
    }

    public static int solution(int x) {
        int answer = 0;
        int cnt = 1;
        for(int i = 3; i <= x; i++) {
            boolean flag = false;
            for(int j = 2; j < i; j++) {
                //System.out.println(j);
                if(i % j == 0) {
                    flag = true;
                }
            }

            if(!flag) cnt++;
        }
        System.out.println(cnt);

        return answer;
    }

    public static void betterSolution(){
        int i, j, flag, cnt = 0;
        int n = 20;

        for(i=0; i<=n; i++) {
            flag = 1;
            for(j = 2; j*j <= i; j++) {
                if(i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) cnt++;
        }
        System.out.println(cnt);
    }
}