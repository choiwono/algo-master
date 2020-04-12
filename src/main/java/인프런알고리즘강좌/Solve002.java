package 인프런알고리즘강좌;

import java.util.*;

public class Solve002 {
    public static void main(String[] args) {
        String answer = solution(3,7);
        System.out.println(answer);
    }

    public static String solution(int a, int b) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;

        for(int i = a; i<= b; i++) {
            if(i == a) {
                sb.append(a);
            } else {
                sb.append(" + "+i);    
            }
            sum += i;
        }
        sb.append(" = "+sum);

        return sb.toString();
    }
}