package 기타;

public class NetWork {
    public static void main(String[] args) {
        NetWork netWork = new NetWork();
        // 연결이 되어있는 경우 계속 탐색, 없으면 중지..!
        // 배열에 무방향 그래프가 저장되있는 경우..
        int[][] arr = {{1,1,0},{1,1,0},{0,0,1}};
        int answer = netWork.solution(3,arr);
        System.out.println(answer);
    }

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
