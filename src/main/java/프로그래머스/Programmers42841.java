package 프로그래머스;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Programmers42841 {
    public static void main(String[] args) {
        int[][] baseball = {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
        Programmers42841 program = new Programmers42841();
        System.out.println(program.solution(baseball));
    }

    public int solution(int[][] baseball) {
        int answer = 0;
        // 일단은 겹치지 않는 숫자를 만들자
        List<String> list = new ArrayList<>();

        int s = 0;
        int b = 0;
        int s1 = 0;
        int b1 = 0;

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                for(int k = 1; k < 10; k++) {
                    if(i != j && j != k && i != k) {
                        list.add(String.valueOf(i * 100 + j * 10 + k));
                    }
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            String temp = list.get(i);
            int cnt = 0;
            for (int j = 0; j < baseball.length && cnt < baseball.length; j++) {

                s = baseball[j][1];
                b = baseball[j][2];
                s1 = strike(temp,Integer.toString(baseball[j][0]));
                b1 = ball(temp,Integer.toString(baseball[j][0])) - s1;
                if(s1 == s && b == b1)
                    cnt++;
                // 베이스볼 같은 경우, 베이스의 볼의 숫자 모두와 일치하는 경우의 수만 정답
                // 123, 356, 327, 489를 통해서 얻은 스트라이크와 볼 갯수가 모두 일치하는 숫자만 정답..!
                // 하나라도 일치하는 경우의 수로 구할경우 정답이 나오지 않는다.. 이런 디테일이 중요함!!
                if(cnt == baseball.length)
                    answer++;
            }
        }
        return answer;
    }

    public static int strike(String num, String target) {
        int cnt = 0;
        for(int i = 0; i < target.length(); i++) {
            cnt = num.charAt(i) == target.charAt(i) ? cnt + 1 : cnt;
        }
        return cnt;
    }

    public static int ball(String num, String target) {
        int cnt = 0;
        for(int i = 0; i < target.length(); i++) {
            cnt = num.contains(String.valueOf(target.charAt(i))) ? cnt + 1 : cnt;
        }
        return cnt;
    }
}
