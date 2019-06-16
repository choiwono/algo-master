package 기타;

import java.util.*;

public class DfsBfs {

    static int[][] graph;
    static boolean visited[];
    static int N;
    static int E;
    static int startPoint;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[1001][1001];
        E = sc.nextInt();
        visited = new boolean[10001];
        startPoint = sc.nextInt();

        int a,b;

        for(int i=1; i<=E; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1; // 배열로 1,2 2,1 연결되어있다는 표시!!
        }

    }

    // dfs 깊이 우선탐색
    public static void dfs(int i){
        // 탐색하자마자 true로 변경

        visited[i] = true;
        System.out.println(i+"  ");
        for(int j=0; j<=N; j++){
            if(graph[i][j]==1 && visited[j] == false){
                dfs(j);
                // 서로 연결되어있고, 아직 탐색을 안했을 경우 dfs로 다시 탐색..!
            }
        }
    }
}
