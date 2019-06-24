package 백준;

import java.util.*;

public class Backjoon2178 {
    static int[] dx = {0,1,0,-1}; // 상하좌우 탐색
    static int[] dy = {1,0,-1,0}; // 상하좌우 탐색
    static int n,m;
    static int map[][]; // 미로
    static boolean[][] visited; // 미로 방문을 구분하기 위함

    public static void bfs(int x, int y){ // 시작좌표 보통 0,0
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.add(x);
        qy.add(y);

        while(!qx.isEmpty() && !qy.isEmpty()){
            x = qx.poll(); // x 하나 꺼내자
            y = qy.poll(); // y 하나 꺼내자
            visited[x][y] = true; // x,y 좌표는 탐색완료

            for(int i=0; i<4; i++){ // 상하좌우 탐색을 위해서..
                int _x = x + dx[i];
                int _y = y + dy[y];
                // x,y가 0보다 작으면 안됨 배열에서 벗어나게됨
                if(_x >= 0 && _y >= 0 && _x < n && _y < m){
                    if(map[_x][_y] == 1 && visited[_x][_y] == false){
                        qx.add(_x);
                        qy.add(_y);
                        visited[_x][_y] = true;
                        map[_x][_y] = map[x][y] + 1; // 방문한 좌표는 이동횟수로 변경? 이게 무슨소리..
                    }
                }
            }
        }
    }

    // 최소시간, BFS 문제다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[100][100];
        visited = new boolean[100][100];

        for(int i=0; i<n; i++){
            String temp = sc.next();
            for(int j=0; j<m; j++){
                map[i][j] = temp.charAt(j) - 48;
            }
        }

        bfs(0,0);
        System.out.println(map[n-1][m-1]);
    }
}
