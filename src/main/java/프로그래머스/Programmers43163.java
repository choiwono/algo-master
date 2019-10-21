package 프로그래머스;

import java.util.*;

public class Programmers43163 {
    // 방문했는지 체크..
    int answer = 0;
    boolean visited[]; 

    public static void main(String[] args){
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        String begin = "hit";
        String target = "cog";

        Programmers43163 programmers = new Programmers43163();
        int realAnswer = programmers.solution(begin, target, words);
        System.out.println(realAnswer);
    }
    
    public int solution(String begin, String target, String[] words){
        // visited 값 넣고.. bfs로 시작
        visited = new boolean[words.length];
        bfs(0, words, begin, target, 0);

        return answer;
    }

    private void bfs(int index, String[] words, String begin, String target, int stage) {
        LinkedList<Integer> queue = new LinkedList<>();
        
        if(index == 0){
            for(int i=0; i<words.length; i++){
                if(str_match(begin,words[i]) == true){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        // 글자가 한글자라도 같은 경우 통과.. 
        while(!queue.isEmpty()){
            // queue가 빌때까지 반복..!
        }
    }

    private boolean str_match(String begin, String string) {
        int count = 0;
        for(int i = 0; i<begin.length(); i++){
            if(begin.substring(i,i+1).compareTo(string.substring(i,i+1)) != 0){
                count++;
            }
        }

        if(count == 1){
            return true;
        }
        return false;
    }

    

    // bfs로 인덱스 0번부터 시작..
    /*public void bfs(int index, String[] words, String begin, String target, int stage){
        LinkedList<Integer> queue = new LinkedList<>();
        // bfs를 위해서 queue를 만듬..
        // 1글자씩 비교했는데 값이 같을 경우.. queue에 넣는다.
        if(index == 0){
            for(int i=0; i<words.length; i++){
                if(str_match(begin,words[i]) == true) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        // queue가 빌때까지 반복
        while(!queue.isEmpty()){
            int x = queue.getFirst();
            queue.pollFirst();
            stage++;
            // que에 들은 i값을 꺼낸다.
            // target과 words값이 같을 경우.. 정답
            if(words[x].compareTo(target) == 0){
                answer = stage;
                return;
            }
            // 방문하지 않은경우.. words의 i와 x의 문자열이 같을 경우, 
            // 다시 큐로 i를 넣는다 그뒤 방문여부 체크
            for(int i=0; i<words.length; i++){
                if(visited[i] == false && str_match(words[x], words[i])){
                    queue.push(i);
                    visited[i] = true;
                }
            }
        }
        answer = 0;
    }

    private boolean str_match(String str1, String str2) {
        int total = 0;
        for (int i=0; i<str1.length(); i++){
            if(str1.substring(i, i+1).compareTo(str2.substring(i, i+1)) != 0){
                total++;
            }
        }
        if(total == 1){
            return true;
        }
        return false;
    }*/
}