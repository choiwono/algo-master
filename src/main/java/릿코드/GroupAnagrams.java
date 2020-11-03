package 릿코드;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        // map으로 string 값을 찾는다
        Map<String, List> map = new HashMap<>();

        for(String s : strs) {
            char[] alpabet = s.toCharArray();
            Arrays.sort(alpabet);
            String alpabetKey = String.valueOf(alpabet);

            if(!map.containsKey(alpabetKey)) {
                map.put(alpabetKey, new ArrayList());
            }
            map.get(alpabetKey).add(s);
        }

        return new ArrayList(map.values());
    }
}

