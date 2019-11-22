package 프로그래머스;

import java.util.ArrayList;

public class Programmers62049 {
    public static void main(String[] args) {

    }

    public static int[] solution(int n){
        //int[] answer = {};
        // 단순 수학문제.. 규칙을 찾아야한다
        int[] answer = {};
        int[] in = {0};

        if(n == 1) return in;

        for(int i=0; i< n-1; i++){
            in = tree(in);
        }

        answer = in;

        return answer;
    }

    private static int[] tree(int[] in) {
        int[] answer = new int[in.length * 2 + 1];
        int[] reversed = new int[in.length];

        int asIdx = 0;

        for(int i=0; i<in.length; i++){
            answer[i] = in[i];

            if(in[in.length - 1 -i] == 0){
                reversed[i] = 1;
            } else {
                reversed[i] = 0;
            }
        }

        asIdx = in.length;
        answer[asIdx] = 0;

        asIdx++;
        for(int i=0; i<reversed.length; i++){
            answer[i + asIdx] = reversed[i];
        }

        return answer;
    }
}
