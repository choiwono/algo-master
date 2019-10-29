package 프로그래머스;

import java.util.*;

public class BiggerNumber {
    public String solution(String number, int k) {
        StringBuilder str = new StringBuilder();
        // 최대 자리수는 number - k 를 넘지 말아야한다.
        char max;
        int idx = 0;
        for (int i = 0; i < number.length() - k; i++) { // 10 - 4
            // 0~5까지 반복
            max = '0';
            for (int j = idx; j <= i + k; j++) {
                if (number.charAt(j) > max) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            str.append(max);
        }
        return str.toString();
    }
}