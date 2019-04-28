import java.util.*;

public class ProgrammersLevel2Top {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stk = new Stack<>();
        for(int height : heights){
            stk.push(height);
        }
        int next;
        int j=0;
        while(!stk.empty()){
            next = stk.pop();
            for(int i=stk.size()-1; i>-1; i--){
                if(next < heights[i]){
                    answer[heights.length-j-1] = i+1;
                    break;
                }
            }
            j++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {3,9,9,3,5,7,2};
        int[] answers = solution(heights);
        for(int p : answers){
            System.out.println(p);
        }
    }
}
