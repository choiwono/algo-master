package 기타;

import java.util.ArrayList;

public class NumbersOf {
    public static void main(String[] args) {
        int n = 10;
        NumbersOf numbers = new NumbersOf();
        numbers.solution(n);
    }

    public String solution(int n){
        String answer = "";
        int temp = 0;

        while(n > 0) {
            temp = n % 3;
            n = n/3;
            if(temp == 0){
                temp += 4;
                n = n-1;
            }
            answer = temp + answer;
        }
        return answer;
    }
}
