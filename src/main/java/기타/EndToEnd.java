package 기타;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EndToEnd {
    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = solution(3,words);
        for(int i : answer){
            System.out.print(i+" ");
        }
    }

    public static int[] solution(int n, String[] words){
        Queue<String> wordsQue = new LinkedList<>();
        List<String> list = new ArrayList<>();

        for(String s : words)
            wordsQue.offer(s);

        int cnt = 1;
        String temp = wordsQue.poll();

        while(true){
            cnt++;
            if(temp.endsWith(wordsQue.peek().substring(0,1))){
                list.add(temp);
                temp = wordsQue.poll();

                for(String s : list){
                    if(temp.equals(s)){
                        if(cnt % n == 0){
                            return new int[]{n,cnt / n};
                        } else {
                            return new int[]{cnt % n, cnt / n + 1};
                        }
                    }
                }

            } else {
                if(cnt % n == 0){
                    return new int[]{n,cnt / n};
                } else {
                    return new int[]{cnt % n, cnt / n + 1};
                }
            }

            if(wordsQue.isEmpty()){
                return new int[]{0,0};
            }
        }
    }
}
