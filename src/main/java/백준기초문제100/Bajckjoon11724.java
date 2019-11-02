package 백준기초문제100;

import java.util.Scanner;

public class Bajckjoon11724 {
    static int com, conn;
    static int[][] map;
    static int cnt;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        com = sc.nextInt();
        conn = sc.nextInt();

        map = new int[com+1][com+1];
        visited = new int[com+1];

        for(int i=0; i<conn; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt);
    }
    // 1번 부터 탐색시작
    public static void dfs(int start) {
        visited[start] = 1;

        for(int i=1; i<com+1; i++){
            if(map[start][i] == 1 && visited[i] == 0){
                dfs(i);
                cnt++;
            }
        }
    }
}
