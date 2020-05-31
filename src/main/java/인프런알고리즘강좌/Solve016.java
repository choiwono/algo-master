package 인프런알고리즘강좌;

import java.util.*;

public class Solve016 {
    public static void main(String[] args) {
        String[] strs = new String[]{"AbaAeCe","baeeACA"};
        String answer = solution(strs);
        System.out.println(answer);
    }

    public static String sortStr(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).toString();
    }

    public static String solution(String[] args) {
        String answer = "NO";
        String[] arr = new String[args.length];
        for(int i=0; i<args.length; i++) {
            String str = sortStr(args[i]);
            arr[i] = str;
        }

        if(arr[0].equals(arr[1])) {
            return "YES";
        }

        return answer;
    }
}