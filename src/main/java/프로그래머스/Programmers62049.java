package 프로그래머스;

import java.util.ArrayList;

public class Programmers62049 {
    public static void main(String[] args) {
        int answer[] = solution(3);
        for(int i : answer) {
            System.out.print("배열 = "+i);
        }
    }
    // 수열을 활용한 문제.. 0을 기준으로 
    // 인덱스가 짝수인값이 0인지 1인지 비교해서 뒤에 0을 넣는가 1을 넣는가를 결정한다..
    public static int[] solution(int n){
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        
        // {0,0}
        // 0,0,1,0
        for (int i = 2; i <= n; i++) {
            list.add(0);
            int a = list.size();

            for (int j = a - 2; j >= 0; j--) {
                if (list.get(j) == 1) {
                    list.add(0);
                } else if (list.get(j) == 0) {
                    list.add(1);
                }
            }

        }
        
        int size = list.size();
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
