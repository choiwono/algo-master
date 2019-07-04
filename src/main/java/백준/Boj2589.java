package 백준;

import java.util.*;

public class Boj2589 {
    static int[] dx = {0,1,0,-1}; // 상하좌우 탐색
    static int[] dy = {1,0,-1,0}; // 상하좌우 탐색
    static String[][] map;
    static boolean[][] visit;
    static int n,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new String[n+1][m+1];

        for(int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("");
            for(int j = 0; j < m; j++) {
                map[i][j] = arr[j];
                visit[i][j] = false;
            }
        }

        bfs(0,0);
    }

    public static void bfs(int x, int y){
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.add(x);
        qy.add(y);

        while(!qx.isEmpty() && !qy.isEmpty()){
            x = qx.poll();
            y = qy.poll();
            visit[x][y] = true;

            for(int i=0; i<4; i++){
                int _x = x+dx[i];
                int _y = y+dy[i];

                if(_x >= 0 && _y >= 0 && _x < n && _y < m){
                    if(map[_x][_y] == "L" && visit[_x][_y] == false){
                        qx.add(_x);
                        qy.add(_y);
                        visit[_x][_y] = true;
                        map[_x][_y] = map[x][y] + 1; // 방문한 좌표는 이동횟수로 변경? 이게 무슨소리..
                    }
                }
            }
        }
    }
}
