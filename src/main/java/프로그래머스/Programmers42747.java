package 프로그래머스;

import java.util.*;

public class Programmers42747 {
    public static void main(String[] args) {
        int[] a = {3,0,6,1,5};
        int answer = solution(a);
        System.out.println(answer);
    }

    public static int solution(int[] citations){
        int answer = 0;
        Integer[] tmp = new Integer[citations.length];

        for(int i = 0; i < citations.length; i++)
            tmp[i] = Integer.valueOf(citations[i]);
        Arrays.sort(tmp, Collections.reverseOrder());

        for(int i = 0; i < tmp.length; i++) {
            if(i+1 <= tmp[i])
                answer = i+1;
        }

        return answer;
    }
}
