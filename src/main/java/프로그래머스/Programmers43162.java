package 프로그래머스;

public class Programmers43162 {
    int answer = 0;
    boolean visited[];

    void dfs(int index, int[][] computers, int n){
        visited[index] = true;
        for(int j=1; j<n; j++){
            if(computers[index][j] == 1 && visited[j] == false){
                dfs(j, computers, n);
            }
        }
    }

    public int solution(int n, int[][] computers){
        visited = new boolean[computers.length];
        for (int i=0; i<n; i++){
            if(visited[i] == false){
                dfs(i, computers, n);
                answer++;
            }
        }
        return answer;
    }
}
