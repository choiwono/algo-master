package 기타;

import java.util.ArrayList;

public class ArrayListExam {
    // ArrayList는 동적으로 크기가 조절되는 배열로서, 그러면서도 O(1) 의 접근시간을 유지한다.
    // 통상적으로는 배열이 가득차는 경우, 그 크기가 두배 늘어나도록 구현된다.
    // 크기를 두배 늘리는 시간은 O(n)이지만 자주 일어나는 일이 아니라서 대체적으로 O(1)시간이 유지된다고
    // 보는 것이 옳다.
    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w : words) sentence.add(w);
        for(String w : more) sentence.add(w);
        return sentence;
    }
    // string buffer 구현
    // 문자배열을 선언 -> 기존 문자에 새로 들어온 문자를 더한다
    public String joinWords(String[] words) {
        StringBuffer sentence = new StringBuffer();
        for (String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }
}
