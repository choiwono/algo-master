package 인프런알고리즘강좌;

import java.util.*;

public class Solve013 {
    public static void main(String[] args) {
        solution(1230565625);
    }

    public static int solution(int n) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] str = Integer.toString(n).split("");

        for(int i=0; i<str.length; i++) {
            if(map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]).intValue() + 1);
            } else {
                map.put(str[i], 1);
            }
        }
            
        return answer;
    }
    
}