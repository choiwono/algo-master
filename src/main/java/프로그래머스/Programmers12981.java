package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers12981 {
    public static void main(String[] args) {
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer = solution(2,words);
        for(int i : answer){
            System.out.print(i+" ");
        }
    }

    public static int[] solution(int n, String[] words){
        int[] answer = new int[2];
        Queue<String> wordQue = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();

        for(String s : words)
            wordQue.offer(s);

        String temp = wordQue.poll();
        int cnt = 1;
        while(true){
            cnt++;
            if(temp.endsWith(wordQue.peek().substring(0,1))){
                //cnt++;
                list.add(temp);
                temp = wordQue.poll();
                for(String s : list){
                    if(temp.equals(s)){
                        //return new int[]{};
                        if(cnt % n == 0){
                            return new int[]{n, cnt / n};
                        } else {
                            return new int[]{cnt % n, cnt/n + 1};
                        }
                    }
                }
            } else {
                if(cnt % n == 0){
                    return new int[]{n, cnt / n};
                } else {
                    return new int[]{cnt % n, cnt/n + 1};
                }
            }

            if(wordQue.isEmpty()){
                return new int[]{0,0};
            }
        }
        //return answer;
    }
}
