package 백준;

import java.util.*;

public class Backjoon1260 {
    static int[][] graph;
    static boolean visited[];
    static int N;
    static int E;
    static int startPoint;

    public static void dfs(int i){
        visited[i] = true; // 방문
        System.out.println(i+"  ");
        for(int j=0; j<=N; j++){
            if(graph[i][j] == 1 && visited[j] == false){
                dfs(j);
            }
        }
    }

    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i); // q에다가 i를 넣는다
        visited[i] = true;
        System.out.println(i+"  ");

        int temp;
        while(!q.isEmpty()){ // q가 빌때까지
            temp = q.poll();
            for(int j=0; j<=N; j++){
                if(graph[temp][j] == 1 && visited[j] == false){
                    q.offer(j);
                    visited[j] = true;
                    System.out.println(j+"  ");
                }
            }
        }
    }

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

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(startPoint);

        for(int j=1; j<=N; j++){
            visited[j]=false;
        }
        System.out.println();

        bfs(startPoint);
    }
}
