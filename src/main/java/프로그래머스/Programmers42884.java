package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers42884 {
    public static void main(String[] args) {
        int[][] routes = {{-20,15},{-18,-13},{-14,5},{-5,3}};
        int answer = solution(routes);
        System.out.println(answer);
    }
    // 정렬 필요..
    public static int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int camaraPos = -30001;

        for(int i=0; i<routes.length; i++){
            System.out.println(camaraPos);
            if(camaraPos < routes[i][0]){
                answer++;
                camaraPos = routes[i][1];
            }
        }
        return answer;
    }
}
