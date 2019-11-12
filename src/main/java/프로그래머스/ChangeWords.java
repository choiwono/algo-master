package 프로그래머스;

import java.util.LinkedList;

public class ChangeWords {

    static int answer = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};
        solution(begin,target,words);

    }

    public static int solution(String begin, String target, String[] words){
        int answer = 0;

        visited = new boolean[words.length];
        bfs(0, words, begin, target, 0);
        return answer;
    }

    private static void bfs(int i, String[] words, String begin, String target, int stage) {
        LinkedList<Integer> que = new LinkedList<>();
        // 한글자라도 같은 경우 que에 넣고, q에서 다시 탐색을 시작한다..
        if(i == 0){
            for(int y=0; y<words.length; y++){
                if(str_match(begin,words[i]) == true){
                    que.add(i);
                    visited[i] = true;
                }
            }
        }

        while(!que.isEmpty()){
            int x = que.getFirst();
            que.poll();
            stage++;

            if(words[x] == target){
                answer = stage;
                return;
            }

            for(int t=0; t<words.length; t++){
                if(visited[t] == false && str_match(words[x], words[t])){
                    que.push(t);
                    visited[t] = true;
                }
            }
        }
        answer = 0;
    }

    private static boolean str_match(String begin, String word) {
        int count = 0;
        for(int i=0; i<begin.length(); i++){
            if(begin.substring(i,i+1).compareTo(word.substring(i,i+1)) != 0){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}
