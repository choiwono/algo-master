package 릿코드;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram2("anagram", "nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        boolean answer = false;
        // s = "anagram", t = "nagaram"

        String[] s1 = s.split("");
        String[] s2 = t.split("");
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0; i<s1.length; i++) {
            sb1.append(s1[i]);
        }

        for(int i=0; i<s2.length; i++) {
            sb2.append(s2[i]);
        }

        if(sb1.toString().equals(sb2.toString())) {
            answer = true;
        }

        return answer;
    }

    public static boolean isAnagram2(String s, String t) {
        boolean answer = false;

        if(s.length() != t.length()) {
            return false;
        }

        int[] charArray = new int[256];
        for (char ch : s.toCharArray()) {
            charArray[ch]++;
        }

        for (char ch : t.toCharArray()) {
            int value = --charArray[ch];
            System.out.println(value);
            if (value < 0) {
                return false;
            }
        }

        return answer;
    }
}
