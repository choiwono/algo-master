package 프로그래머스;

public class Programmers12985 {
    public static void main(String[] args) {
        int answer = solution(8,4,7);
        System.out.println(answer);
    }

    public static int solution(int n, int a, int b){

        int answer = 0;
        while(a != b){
            if(a % 2 == 0) {
                a = a / 2;
            } else if(a % 2 > 0){
                a = (a / 2);
                a++;
            }

            if(b % 2 == 0){
                b = b / 2;
            } else if(b % 2 > 0){
                b = (b / 2);
                b++;
            }
            answer++;
        }

        return answer;
    }
}
