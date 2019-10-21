package 인프런알고리즘강좌;

public class Network {
    int answer = 0;
    int n,m;
    public static void main(String[] args) {
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        Network network = new Network();
        int val = network.solution(computers);
    }
    // dfs로 풀어보자..
    public int solution(int[][] computers){
        n = computers.length;
        m = computers[0].length;

        for(int i=0; i<computers.length; i++){
            for(int j=0; j<computers[i].length; j++){
                if(computers[i][j] == 1){
                    //System.out.println("i: " + i + " y: " + j);
                    answer++;
                    dfs(computers,i,j);
                }
            }
        }
        return answer;
    }
    
    // 연결 끊기면 +1
    public void dfs(int[][] computers, int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n || computers[i][j] != 1){ 
            return;
        }
        
        computers[i][j] = 2;

        dfs(computers, i - 1, j);
        dfs(computers, i + 1, j);
        dfs(computers, i, j + 1);
        dfs(computers, i, j - 1);
    }
}