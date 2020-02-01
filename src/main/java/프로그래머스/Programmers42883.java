package 프로그래머스;

public class Programmers42883 {
    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;
        System.out.println(solution(number,k));
    }

    public static String solution(String number,int k){
        String answer = "";
        // 1924 -> 19 12 14 92 94 24
        // 총 6가지의 경우의 수중 가장 큰수는 94
        // k는 제거할수 있는 자릿수
        // number는 총 숫자
        // 1924로 만들자
        // 모든 경우의수를 체크할 수 있는 방법을 찾자
        //String temp = "";
        String[] str = number.split("");
        
        int idx = 0;
        
        for(int i=0; i<str.length - k; i++) {
           // 123, 4
            int max = 0;
            for(int j=idx; j<=i+k; j++) {
                if(Integer.parseInt(str[j]) > max) {
                    idx = j + 1;
                    max = Integer.parseInt(str[j]);
                    System.out.println(str[j]+","+max);
                }
            }
            answer += Integer.toString(max);
            //System.out.println(answer);
        }

        return answer;
    }
}
