package 프로그래머스;

import java.util.*;

public class ConnectIsland2 {

    public static void main(String[] args) {
        int n = 4;
        int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };
        ConnectIsland2 cIsland = new ConnectIsland2();
        int answer = cIsland.solution(n, costs);
        System.out.println(answer);
    }
    
    // 섬 연결하기..
    // 최저비용으로 모든섬을 연결하자, 연결이 불가능할 경우에는 -1을 리턴..
    public int solution(int n, int[][] costs) {

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        // 더이상 연결할 섬이 없을 경우 종료.. 혹은 모든 섬이 연결됐을 경우 종료
        // 맨처음 섬부터 연결 ( 비용이 가장 낮다 )
        int answer = 0;
        boolean[] checked = new boolean[n];
        
        return answer;
    }
}