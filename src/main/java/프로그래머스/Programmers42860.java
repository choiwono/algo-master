package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers42860 {
    public static void main(String[] args) {
        String name = "ABABAAAAAAABA";
        //String name = "JAN";
        //String name = "BBAABB";
        //String name = "JAO";
        Programmers42860 programmers = new Programmers42860();
        System.out.println(programmers.solution(name));
    }

    public int solution(String name){
        int answer = 0;
        // 어떤식으로 조작해야 최소값이 나오는지 계산
        // name값 - 'A' 해서 14이상일 경우는 아래로 가는게 유리 
        // 14 =< 'Z' - 문자열, 14보다 같거나 클경우
        // 13 =< 문자 - 'A'가 유리하다, 13보다 작을경우
        // 일단 왼쪽, 오른쪽 어느쪽이 유리한지 먼저 계산
        int rightMax = 0, leftMax = 0, rightMove = 0, leftMove = 0;
        int left = name.length() - 1, right = name.length() - 1;
        
        for(int i=0; i<name.length(); i++) {
            int target = name.charAt(i) - 'A';
            if(target == 0) rightMove++;

            if(target <= 13) {
                rightMax += target;
            } else if(target > 13) {
                rightMax += 'Z' - name.charAt(i) + 1;
            }
        }

        rightMax = rightMax + right - rightMove;

        for(int i=name.length() - 1; i>=0; i--) {
            int target = name.charAt(i) - 'A';
            if (target == 0)
                leftMove++;

            if (target <= 13) {
                leftMax += target;
            } else if (target > 13) {
                leftMax += 'Z' - name.charAt(i) + 1;
            }
        }

        leftMax = leftMax + left - leftMove;
        //System.out.println(max+","+right+","+leftMove);

        return Math.min(leftMax, rightMax);
        // 9 + 4 + 9 + 12 + 4 + 13
        // 13 + 21 + 17 = 51 + 5 = 56
    }
}
