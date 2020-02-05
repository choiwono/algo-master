package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers42860 {
    public static void main(String[] args) {
        //String name = "ABABAAAAAAABA";
        String name = "JAAZN";
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
        while(true) {
            int max = 0;
            int right = name.length() - 1;
            //int zero = 0;
            for(int i=0; i<name.length(); i++) {
                // 오른쪽
                // 0인 경우에는 길이값 - 0 이동거리에 치지않는다.
                
                int temp = name.charAt(i) - 'A';
                //System.out.println(temp);
                if(temp > 0) {
                    if(temp <= 13) {
                        System.out.println(temp);
                        max += temp;
                    } else if(temp >= 14) {
                        System.out.println(temp);
                        max += 'Z' - name.charAt(i);
                    }
                } else if(temp == 0){
                    right--;
                }
            }
            
            if(max > 1) {
                System.out.println(max+","+right);
                break;
            }
        }
        

        return answer;
    }
}
