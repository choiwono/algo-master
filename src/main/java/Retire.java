import java.util.*;

public class Retire {
    // 퇴사문제
    // 남은 N일동안 상담을 해서 가장 많은 수익을 얻을 수 있는 경우의 수를 구하라
    // 퇴사날 : N+1
    // 경우의 수
    // 불가능인 경우, day > n+1 -> 상담날짜합이 퇴사날보다 클때
    // 수익을 찾은 경우, day == n+1 -> 상담날짜합이 퇴사날과 같을때
    // 상담을 하는경우 go(day+t[day],sum+p[day]) / 상담을 하지 않는경우 go(day+1,sum)

    static final int inf = -100000000;
    static int[] t; // 총 날짜
    static int[] p; // 상담시 얻는 금액
    static int n; // 퇴사날짜
    static int ans = 0;
    static void go(int day, int sum) { // day는 날짜값, sum은 지금까지 얻은 수익
        if(day == n+1) { // day와 퇴사날이 일치하는 경우 ( 정답 케이스 )
            if(ans < sum) {
                ans = sum;
            }
            return;
        }
        if(day > n+1) { // day가 퇴사날짜보다 클 경우 종료(불가능 케이스)
            return;
        }
        go(day+1,sum); // 상담을 진행하지 않는경우 날짜값만 증가된다.
        go(day+t[day], sum+p[day]);
        // 상담을 진행한경우 날짜값만큼 day값이 올라감, sum에 금액도 추가됨.
        // day가 퇴사날이 될때까지 배열을 탐색해서 날짜값과 상담비용을 증가시킨다.
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new int[n+1]; // 1일부터 시작하기때문에 +1
        p = new int[n+1]; // 이하동일
        for (int i=1; i<=n; i++) { // 퇴사날만큼 배열반복
            t[i] = sc.nextInt(); // 상담날짜 입력
            p[i] = sc.nextInt(); // 금액 입력
        }
        go(1,0); // 1일부터 시작한다.
        System.out.println(ans);
    }
}
