package 백준;

import java.util.*;

public class Backjoon1107 {
    static int chanell = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];

        for(int i=0; i<M; i++)
            arr[i] = sc.nextInt();
        // N 목표 숫자, arr 망가진 리모컨
        solution(N,M,arr);
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
        String value = "";
        int min = 0;

        int temp = Math.abs(100-N);
        // 100에서 바로 + - 를 할 수 있다.
        // 6 7 8 이 망가졌을 경우 이 숫자들은 리모컨에서 사용불가

        for(int i=0; i<10000; i++){
            if(button[i]) continue;
            value += Integer.toString(i); // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
            System.out.println(value);
        }

        return answer;
    }
}
