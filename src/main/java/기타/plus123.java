package 기타;

import java.util.Scanner;

public class plus123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Integer value = scanner.nextInt(); // 숫자값을 사용자에게 입력받는다.
            int sum = 0; // 합계
            int goal = go(sum,value); // 1,2,3으로 n 값을 구하는 가짓수
            System.out.println(goal);
        }
    }

    public static int go(int sum, int goal) { // 재귀함수
        if(sum > goal) return 0; // 합계가 n 값보다 클때는 0을 리턴해준다.
        if(sum == goal) return 1; // 합계 == n값 일치할때는 1.
        int now = 0;
        for (int i=1; i<=3; i++) {
            now += go(sum+i,goal);
            // 1,2,3으로 합계가 n값과 일치하는 가짓수가 나올때마다 now에 1씩 더해준다.
        }
        return now; // 방법이 나올때마다 1을 리턴해준다.
    }
}
