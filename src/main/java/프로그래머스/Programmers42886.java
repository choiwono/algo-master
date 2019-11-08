package 프로그래머스;

import java.util.*;

public class Programmers42886 {
    public static void main(String[] args) {
        // 무게추들의 값이 주어진다
        // 무게추로 측정할 수 없는 양의 정수값을 구하자
        // 가장 처음에 일치하는 값이 있는지 찾는다
        // 찾으면 ok 없으면 숫자들을 조합해서 양의 수를 찾을 수 있는 체크한다
        // 도저히 찾을 수 없으면 끝 거기서 답을 리턴

        // 1, 1, 2, 3, 6, 7, 30
        int[] weight = {1,1,2,3,6,7,30};
        solution(weight);
    }

    public static int solution(int[] weight){
        int answer = 0;

        Arrays.sort(weight, new Comparator<int>() {
            @Override
            public int compare(int o1, int o2) {
                return o2 - o1;
            }
        });

        return answer;
    }
}
