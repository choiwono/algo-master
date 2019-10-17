package 프로그래머스;

public class Programmers43162 {
    
    static int answer = 0;
    static boolean[] chk;
    public static void main(String[] args){
        
    }

    public static int solution(int n, int[][] computers){
        int start = 0;
        chk = new boolean[n];
        
        dfs(computers, chk, start);    
        return answer;
    }

    public static void dfs(int[][] computers, boolean[] chk, int start){
       if(chk[start]) return;
       // 탐색완료
       chk[start] = true;

       
    }
}
