package 프로그래머스;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        String answer = solution(participant,completion);
        System.out.println(answer);
    }

    public static String solution(String[] participant,String[] completion){
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        Queue<String> partiQ = new LinkedList<>();
        //Queue<String> compleQ = new LinkedList<>();
        for(String i : participant)
            partiQ.offer(i);

        for(int i=0; i<completion.length; i++){
            if(partiQ.peek().equals(completion[i])){
                partiQ.remove();
            }
        }

        return partiQ.poll();
    }
}
