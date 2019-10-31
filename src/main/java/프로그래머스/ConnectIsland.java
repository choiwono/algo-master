package 프로그래머스;

import java.util.*;

public class ConnectIsland {
    public static void main(String[] args) {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        ConnectIsland cIsland = new ConnectIsland();
        int answer = cIsland.solution(n, costs);
        System.out.println(answer);
    }
    // 섬 연결하기..
    // 최저비용으로 모든섬을 연결하자, 연결이 불가능할 경우에는 -1을 리턴..
    public int solution(int n, int[][] costs){
        
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[2] - o2[2];
            }
        });

        boolean[] check = new boolean[costs.length];  
        boolean[] ok = new boolean[n];

        // 서로 연결되어있는 값 0,1 배열값은 true로 변경..
        ok[costs[0][0]] = true;
        ok[costs[0][1]] = true;
        check[0] = true;
        
        //  다리비용
        int answer = costs[0][2];
        int complete = 2;

        while(complete < n){
            for(int i=1; i<check.length; i++){
                if(!check[i] && ((ok[costs[i][0]]&&!ok[costs[i][1]])||(ok[costs[i][1]]&&!ok[costs[i][0]]))) {
                    check[i] = true;
                    ok[costs[i][0]] = true;
                    ok[costs[i][1]] = true;
                    complete++;
                    answer += costs[i][2];
                    break;
                }
            }
        }

        return answer;
    }
}