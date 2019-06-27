package 프로그래머스;

public class Programmers43162 {
    public int solution(int n, int[][] computers){
        int answer = 0;
        boolean[] chk = new boolean[n];
        // n 길이만큼 체크배열을 만들었다.
        for(int i=0; i<n; i++){
            if(!chk[i]){ // 탐색이 안된경우..!, 탐색이 안됐다는건 결국 서로 연결이 되어있지 않기에 ++
                dfs(computers,chk,i);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, boolean[] chk, int start){
        chk[start] = true;
        for(int j=0; j<computers.length; j++){
            if(chk[j] == false && computers[start][j] == 1){
                dfs(computers,chk,j);
            }
        }
    }
}
