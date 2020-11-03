package 릿코드;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        characterReplacement("ABAB", 2);
    }

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0;
        int res = 0;
        int max = 0;
        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            max = Math.max(max, count[s.charAt(end) - 'A']);
            // need to shrimp start - end
            if (end - start + 1 - max > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}
