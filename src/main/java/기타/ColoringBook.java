package 기타;

public class ColoringBook {
    static int areaNum = 0;

    public static void main(String[] args) {
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        ColoringBook coloringBook = new ColoringBook();
        coloringBook.solution(6,4,picture);
        System.out.println(areaNum);
    }

    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[101][101];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; i++){
                if(picture[i][j] != 0){
                    dfs(visited,i,j, picture[i][j], picture);
                }
            }
        }

        return answer;
    }
    public void dfs(boolean[][] visited, int i, int j, int t,int[][] picture){
        visited[i][j] = true;
        // 탐색을 같은 숫자일 경우 탐색..
        for(int p=0; p<picture.length; p++){
            for(int q=0; q<picture[i].length; q++){
                if(picture[i][j] != t && !visited[i][j]) {
                    areaNum++;
                }
            }
        }
    }
}
