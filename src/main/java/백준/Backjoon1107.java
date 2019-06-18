package 백준;

import java.util.*;

public class Backjoon1107 {
    //static int chanell = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];

        for(int i=0; i<M; i++)
            arr[i] = sc.nextInt();
        // N 목표 숫자, arr 망가진 리모컨
        System.out.println(solution(N,M,arr));
    }

    public static int solution(int N,int M, int[] arr){
        // 5476 목표 숫자..
        // 감안해야할 사항
        // 1번, 100 에서 + - 로 이동하는게 더 빠른경우!!
        // 2번, 모든 버튼이 고장난 경우.
        // 3번, 모든 숫자를 만들어서 비교하자.. 최대올수 있는 숫자
        // 4번, 최대 올 수 있는 숫자는 999,999 이유는 만약 500,000가 최대값이어도
        // 리모컨이 9빼고 다 고장났을 경우 999,999에서 -하는 방법말고는 갈수가없기때문에.

        int answer = 0;
        boolean[] button = new boolean[10];
        int max = 999999;
        for(int i=0; i<arr.length; i++)
            button[arr[i]] = true;
        // 망가진 버튼 값을 넣었음..
        int temp = Math.abs(100-N); // + - 로 바로 이동하는 절대값

        for(int i=0; i<= 1000000; i++){
            int c = i;
            int length = canMove(c,button);
            if(length > 0){ // 800 - 5266
                int press = c - N;
                if(press < 0){
                    press = -press;
                }
                if(temp > length + press){
                    temp = length + press;
                }
            }
        }

        // 100에서 바로 + - 를 할 수 있다.
        // 6 7 8 이 망가졌을 경우 이 숫자들은 리모컨에서 사용불가
        return temp;
    }

    public static int canMove(int c, boolean[] button){
        int length = 0;
        if(c == 0)
            return button[0] ? 0:1; // 0이 못쓰는 번호일 경우

        while(c > 0){
            if(button[c % 10]){
                // 10으로 나눴을때 나머지값에 해당하는 키가 못쓰는 키일 경우..
                return 0;
            }
            length += 1;
            c /= 10;
        }
        return length;
    }
}
