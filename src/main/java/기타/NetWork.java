package 기타;

public class NetWork {
    public static void main(String[] args) {
        NetWork netWork = new NetWork();
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(netWork.solution(n,computers));
    }

    public int solution(int n, int[][] computers){
        int answer = 0;
        boolean[] chk = new boolean[n];
        for(int i=0; i<n; i++){
            if(!chk[i]){
                dfs(computers,chk,i);
                answer++;
            }
        }
        return answer;
    }

    void dfs(int[][] computers, boolean[] chk, int start){
        chk[start] = true;
        // 탐색완료 일 경우 true로 바꿈
        // 탐색을 안했을 경우 끝까지 탐색..!!
        // a - b b - c 이런식으로 연결되있을경우 1개, 결국 끝까지 모두 탐색해서 어디까지
        // 연결되어 있는지 확인이 필요한 문제!!
        for(int i=0; i<computers.length; i++){
            if(computers[start][i] == 1 && !chk[i]){
                dfs(computers,chk,i);
            }
        }
    }
}
