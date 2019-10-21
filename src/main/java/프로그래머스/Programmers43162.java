package 프로그래머스;

public class Programmers43162 {
    //int answer = 0;
    //boolean visited[];

    public static void main(String[] args){
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        
        Programmers43162 programmers = new Programmers43162();
        int answer = programmers.solution(n,computers);
        System.out.println(answer);
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!chk[i]) {
                dfs(computers, chk, i);
                answer++;
            }
        }
        return answer;
    }

    void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;
        for(int i = 0; i < computers.length; i++) {
            if(computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }
    }
}
