package 프로그래머스;

public class Programmers12899 {
    public String solution(int n) {
        String answer = "";
        int temp = 0;
        // 124 나라의 숫자기 때문에.. 3으로 나눈다.
        // 딱 떨어질 경우에는 4, 딱 떨어지지 않을 경우는 나머지 숫자
        // 3으로 나눠서 나머지가 0인 경우는 무조건 4..
        // 3으로 나눠서 나머지가 있는 경우는 뒤에 붙인다.
        // 3진수 문제라고 생각하자!!
        while(n > 0){
            temp = n % 3;
            n = n / 3; // 계속 3으로 나누자
            if(temp == 0){
                n = n - 1;
                temp += 4;
            }
            answer = temp + answer;
        }


        return answer;
    }
}
