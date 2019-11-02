package 기타;

import java.util.*;

public class test01 {
    public static void main(String[] args) {
        int day = 4;
        int sum = 0;
        int answer = solution(sum,day);
        System.out.println(answer);
    }

    public static int solution(int sum, int goal){
        
        // day - 1
        if(sum > goal - 1) return 0;
        if(sum == goal - 1) return 1;

        int now = 0;
        
        for(int i=1; i<=2; i++){
            now += solution(sum+i,goal);
        }

        return now;
    }
}