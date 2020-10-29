package 릿코드;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        lengthOfLongestSubstring("au");
    }
    
    public static int lengthOfLongestSubstring(String s) {

        // 2. "dvdf"로 들어오는 경우 현재 로직인 경우에는 에러가 발생함
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int answer = 0, i = 0, j = 0;

        // dvdf로 들어오는 경우..
        while(i < n && j < n) {
            // 범위를 i 부터 j로 좁힌다
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                answer = Math.max(answer, j - i);
                // j = 1, i = 0
            } else {
                set.remove(s.charAt(i));
            }
        }

        return answer;
    }
}