package 백준;

import java.util.*;
// 보물섬 문제풀이
// bfs 문제
// Queue를 담을 클래스
class XY {
    int x;
    int y;
    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Backjoon2589 {

    static int H,W;
    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();

        // 문자열로 맵을 만든다.
        String map[][] = new String[H][W];
        for(int i=0; i<H; i++){
            String str = sc.next();
            for(int j=0; j<W; j++){
                map[i][j] = str.substring(j, j+1);
            }
        }


        // 땅이 발견될때마다 bfs 시작..
        int answer = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                int map_max = 0;
                if(map[i][j].equals("L")){
                    // bfs를 진행..
                    map_max = bfs(i,j,map);
                }
                if(map_max > answer){
                    answer = map_max;
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs(int x, int y, String[][] map){
        // copy map을 매번 만들어서 매번 새로 탐색
        String copy_map[][] = new String[H][W];
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                copy_map[i][j] = map[i][j];
            }
        }
        // 각 지점에 도달하는 시간을 구하자..
        int time[][] = new int[H][W];

        Queue<XY> Q = new LinkedList<XY>();
        Q.add(new XY(x,y));

        copy_map[x][y] = "X";
        time[x][y] = 0;

        // 시작지점 꺼내서 상하좌우 탐색을 했는데 땅이 나올경우 Q에 넣고 또 탐색!
        while(!Q.isEmpty()){
            XY node = Q.poll();

            for(int i=0; i<4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx>=0 && ny>=0 && nx<H && ny<W && copy_map[nx][ny].equals("L")){
                    Q.add(new XY(nx,ny));
                    copy_map[nx][ny] = "X";
                    time[nx][ny] = time[node.x][node.y] + 1;
                }
            }
        }

        int max = 0;

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(time[i][j] > max){
                    max = time[i][j];
                }
            }
        }

        return max;
    }
}
