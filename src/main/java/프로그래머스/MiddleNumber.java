package 프로그래머스;

public class MiddleNumber {
    public static void main(String[] args) {
        solution("qwer");
    }

    public static String solution(String s) {
        String answer = "";
        int number = 0;
        if(s.length() % 2 == 0) {
            // 짝수
            // 4 / 2 == 0
            number = (s.length() / 2) - 1;
            System.out.println(s.substring(number, (s.length() / 2) + 1));
            return s.substring(number, (s.length() / 2) + 1);
        } else {
            // 홀수
            number = s.length() / 2;
            System.out.println(s.substring(number, (s.length() / 2) + 1));
            return s.substring(number, (s.length() / 2) + 1);    
        }
    }
}