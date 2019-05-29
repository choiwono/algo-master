package 백준;

import java.util.*;

public class Backjoon2557 {
    public static void main(String[] args) {
        // 일단 5킬로 그램으로 나눠보고, 그다음에 3킬로 그램으로 확인
        // 그뒤 갯수가 총 몇개 나오는지 계산.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int big = 5;
        int small = 3;
        int answer = 0;
        int rest = 0;

        // 먼저 18kg를 5로 나눠본다. 3개, 3kg가 남는다. 다시 3으로 나눈다 총 개수 4
        // 6을 5로 나눈다. 나머지가 1이다. 그럼 X 애초에 안된다.
        // 9을 5로 나눈다. 4가 남는다. 다시 3으로 나눈다. 1이 남는다. 이러면 X 이러면 다시 3으로 나눈다.
        // 3으로 나눴더니 3이 나온다. 그럼 정답.

        rest = n / big;
        answer = n % big;

        switch(answer){
            case 0 : System.out.println(rest); break;
            case 1 : System.out.println(-1); break;
            case 2 :
        }

    }
}
