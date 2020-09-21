package 인프런알고리즘강좌;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ReSolve013 {
    public static void main(String[] args) {
        int solution = solution(518232759759792517957547995477547857985771547549795757577);
    }

    public static int solution(long x) {
        int answer = 0;
        String str = Long.toString(x);
        String[] strs = str.split("");

        Arrays.sort(strs);

        String temp = strs[0];
        //String max = "";
        int count = 1;
        int max = 1;

        for(int i=1; i<strs.length; i++) {
            if(temp.equals(strs[i])){
                count++;
            } else {
                if(count > max) {
                    max = count;
                    answer = Integer.parseInt(temp);
                }

                temp = strs[i];
                count = 1;
            }
        }

        System.out.println(answer);

        return answer;
    }
}
