package 인프런알고리즘강좌;

public class ReSolve017 {
    public static void main(String[] args){
        String answer = solution(20, 350);
        System.out.println(answer);
    }

    public static String solution(int input, int output){
        String answer = "YES";
        int total = 0;
        for(int i=1; i<=input; i++) {
            total += i;
        }

        if(total != output) return "NO";

        return answer;
    }
}
