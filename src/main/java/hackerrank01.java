import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hackerrank01 {
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {3};
        System.out.println(solution(5,lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int r = lost.length;
        boolean[] l = new boolean[lost.length];
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]
                        && !l[i] && reserve.length >= r && lost[i] != reserve[j]){
                    l[i] = true;
                    r--;
                }
            }
        }

        return answer-r;
    }
}
