package 백준;

import java.util.*;

public class BOJ2667 {
    static int[][] map; // 단지값 선언 ex) n * n
    static int N,cnt; // 입력값, 총 갯수
    static int[][]visited; // 방문여부 체크
    static int dx[] = {-1,1,0,0}; // x 좌표값, 가로
    static int dy[] = {0,0,-1,1}; // y 좌표값 체크, 세로

    static ArrayList al = new ArrayList(); // 출력값을 담을 배열리스트 선언

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        map = new int[N][N]; // 입력받은 값 N * N 배열선언
        visited = new int[N][N]; // 방문받은 값 동일

        for(int i=0;i<N;i++)
        {
            String input = scan.next();
            for(int j=0;j<N;j++)
            {
                map[i][j] = input.charAt(j)-'0'; // 단지 입력값을 2차원 배열에 담는다
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++)
                if(map[i][j] == 1 && visited[i][j] == 0){
                    // 맵의 2차원 배열값이 1인 경우, 아직 방문하지 않은경우
                    // find에 2차원 배열값을 넘긴다.
                    // cnt 값을 추가한다
                    cnt = 1;
                    find(i,j);
                    al.add(cnt);
                }
        }

        Collections.sort(al); // 출력하기전에 정렬

        System.out.println(al.size()); // 정렬에 값 출력

        for(int i=0;i<al.size(); i++)
            System.out.println(al.get(i)); // 값 출력

    }

    static int find(int x, int y) // find 함수 호출시 방문한걸로 값 변경
    {
        visited[x][y] = 1;

        for(int i=0;i<4;i++)
        {
            int nx = x+dx[i]; // 본인 기준으로 4방향 탐색
            int ny = y+dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<N) {
                if(map[nx][ny] == 1 && visited[nx][ny] == 0)
                {
                    find(nx,ny); // 단지내 값중 탐색 안한값이 있을때마다 다시 find 호출
                    cnt++; // 탐색할때마다 cnt값 ++
                }
            }
        }
        return cnt;
    }
}
