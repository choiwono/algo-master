package 인프런알고리즘강좌;

import java.util.Arrays;

public class ReSolve016 {
    public static void main(String[] args) {
        String answer = Solution("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoqrtuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoqrtuvwxyz", "ZBCcdFfgIJKLMNOPQRSTvVxyYAabDEeGHhijklmnoqrtuUwWXzZBCcdFfgIJKLMNOPQRSTvVxyYAabDEeGHhijklmnoqrtuUwWXz");
        System.out.println(answer);
    }

    public static String Solution(String A, String B) {
        String answer = "YES";
        String[] arrayA = A.split("");
        String[] arrayB = B.split("");

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for(int i=0; i<arrayA.length; i++) {
            if(!arrayA[i].equals(arrayB[i])) return "NO";
        }

        return answer;
    }
}
