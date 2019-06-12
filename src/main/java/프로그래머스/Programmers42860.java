package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers42860 {
    public static void main(String[] args) {
        String name = "ABABAAAAAAABA";
        //String name = "JAAZN";
        Programmers42860 programmers = new Programmers42860();
        System.out.println(programmers.solution(name));
    }

    public int solution(String name){
        int answer = 0, n = name.length(),
                leftOrRight = name.length() - 1;
        for(int i = 0; i < n; i++){
            int next = i + 1;
            char target = name.charAt(i);
            // target이 N보다 작거나 같으면 - A 아닐경우 91 - A + A
            if(target <= 'N') answer += target - 'A';
            else answer += 91 - target;
            // next값이 < n 보다 작고, next값이 A일때 next값을 계속 늘린다.
            // 이러면 반복되는 A칸이 몇개나 되는지 알 수 있음..
            // 더 작은수를 찾자, leftOrRight는 처음한칸은 움직일 필요 x - 1
            // 현재까지 진행된 칸 + 최종칸 - 연속되는 A칸
            // + 현재까지 진행칸 과 총남은칸 - 연속된 A칸 중 작은수
            while(next < n && name.charAt(next) == 'A') next++;

            leftOrRight = Math.min(leftOrRight, i + n - next + Math.min(i, n - next));
            /*System.out.println("진행된 칸 = "+i);
            System.out.println("연속된 a칸 = "+next);
            System.out.println("answer 값 = "+answer);
            System.out.println("왼쪽 혹은 오른쪽 = "+leftOrRight);*/
            // 12 + 12 - 7, 17 +  5 // 7,22
        }
        answer += leftOrRight;
        return answer;
    }
}
