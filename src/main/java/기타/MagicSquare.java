package 기타;

import java.util.*;

public class MagicSquare {
    public static void main(String[] args) {
        // 제한 3x3
        // 마방진으로 변경하기 위한 최소 비용
        // 탐색하면서.. 합을 구한다. dfs 문제
        Scanner sc = new Scanner(System.in);
        int[][] s = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                s[i][j] = sc.nextInt();
            }
        }
        solution(s);
    }

    public static int solution(int[][] s){
        int answer = 0;
        int sum = s[0][0] + s[0][1] + s[0][2];
        // 체크해야하는 경우
        // 0,0 0,1 0,2
        // 0,0 1,0 1,2
        System.out.println(sum);
        return answer;
    }
}
