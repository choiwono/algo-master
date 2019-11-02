package 백준기초문제100;

import java.util.*;

public class Backjoon2667 {
    // 단지번호 붙이기
    // 총 단짓수를 출력하자..
    // 단지내의 수를 오름차순으로 출력
    static int[][] map;
    static int N, cnt;
    static int[][] visited;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    static List<Integer> al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        map = new int[N][N];
        visited = new int[N][N];

        // 배열에 1과 0을 넣는다.. 아파트 단지 구성
        for(int i=0; i<N; i++){
            String input = sc.next();
            for(int j=0; j<N; j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){
                    cnt = 1;
                    find(i,j);
                    al.add(cnt);
                }
            }
        }

    }

    private static void find(int x, int y) {
        visited[x][y] = 1;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            // -1, 배열의 최대 크기를 벗어나지 못하도록 한다..
            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(map[nx][ny] == 1 && visited[nx][ny] == 0){
                    find(nx,ny);
                    cnt++;
                }
            }
        }
    }
}
