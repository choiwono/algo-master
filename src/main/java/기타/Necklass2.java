package 기타;

public class Necklass2 {
    static int nE;
    static int nV;
    static int[][] ad;
    static boolean[] visit;

    public static void dfs(int i){
        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
        System.out.print(i+ " ");

        for(int j = 1; j < nV+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){  // j를 방문하지 않았으면 j를 방문한다.
                dfs(j);
            }
        }
    }
}
