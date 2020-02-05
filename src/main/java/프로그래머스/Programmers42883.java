package 프로그래머스;

public class Programmers42883 {
    public static void main(String[] args) {
        String number = "4177252841";
        // 1, 5개 남은거임..
        int k = 4;
        System.out.println(solution(number,k));
    }

    public static String solution(String number,int k){
        String answer = "";
        String[] temp = number.split(""); 
        // 6개중에서 가장큰 수 하나 뽑자..
        // 큰수가 들어갈때 마다 - 1
        int idx = 0;
        for( int i=0; i < temp.length - k; i++ ) {
            int max = 0;
            // 10 - 4 - 1
            // 총 길이 - k, 6글자 - i+1
            // 0 4 5개 1개 골랐어   
            for( int j = idx; j <= i + k; j++ ) {
                if( max < Integer.parseInt(temp[j]) ) {
                    max = Integer.parseInt(temp[j]);
                    idx = j + 1;
                }
            }
            answer += Integer.toString(max);
        }

        
        return answer;
    }
}
