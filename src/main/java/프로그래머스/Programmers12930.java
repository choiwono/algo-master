package 프로그래머스;

public class Programmers12930 {
    public static void main(String[] args) {
        solution("try  hello   world");
    }
    
    public static String solution(String s) {
        String answer = "";
        char[] split = s.toCharArray();
        int num = 0;
        for(int i=0; i<split.length; i++) {
            if(split[i] == ' ') {
                num = 0;
                answer += split[i];
                continue;
            }
            System.out.println(split[i]+","+i);
            if(num % 2 == 0) {
                answer += Character.toUpperCase(split[i]);
            } else if(num % 2 > 0) {
                answer += Character.toLowerCase(split[i]);
            }
            num++;
        }
        System.out.println(answer);

        return answer;
    }

}