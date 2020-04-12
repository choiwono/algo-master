package 인프런알고리즘강좌;

import java.util.*;

public class Solve003 {
    public static void main(String[] args) {
        String answer = solution(20);
        System.out.println(answer);
    }

    public static String solution(int number) {
        StringBuffer sb = new StringBuffer();
        int sum = 1;
        sb.append(1);

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                sum += i;
                sb.append(" + "+i);
            }    
        }
        sb.append(" = "+sum);

        return sb.toString();
    }
}