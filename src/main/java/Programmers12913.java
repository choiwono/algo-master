import java.util.*;

public class Programmers12913 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        solution(land);
    }
    public static int solution(int[][] land){
        int answer = 0;
        int point = -1;
        for(int i=0; i<land.length; i++){
            int max = 0;
            for(int j=0; j<4; j++){
                max = land[i][0];
                if(max < land[i][j]){
                    max = land[i][j];
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
