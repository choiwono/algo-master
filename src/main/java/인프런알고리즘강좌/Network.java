package 인프런알고리즘강좌;

import java.util.*;

public class Network {
    static int answer = 0;
    static int n,m;
    public static void main(String[] args) {
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        int val = solution(computers);
        System.out.println(val);
    }
    // dfs로 풀어보자..
    public static int solution(int[][] computers){
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
    public static void dfs(int[][] computers, int i, int j){
        System.out.println("==dfs=====i: " + i + " y: " + j);
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