package 프로그래머스;

import java.util.HashMap;
import java.util.Stack;

public class Programmers {

    public static int[] solution(int money){

        int coin[] = {50000,10000,5000,1000,500,100,50,10,1};
        int[] answer = new int[coin.length];

        for(int i=0; i<coin.length; i++){
            if((money / coin[i]) > 0){
                answer[i] = money / coin[i];
            }
            money %= coin[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(50237);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
