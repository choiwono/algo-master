import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers42586 {
    public static void main(String[] args) {
        int[] progress = {93,30,55};
        int[] speeds = {1,30,5};
        int[] result = solution(progress,speeds);
        for(int i : result){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] progress, int[] speeds){
        List<Integer> answerList = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        // 7 , 3 , 9
        for(int i=0; i<progress.length; i++){
            double remain = (100 - progress[i]) / speeds[i];
            int day = (int)Math.ceil(remain);
            // 반올림 처리
            // 7,3,9
            if(!que.isEmpty() && que.peek() < day){
                answerList.add(que.size());
                que.clear();
            }
            que.offer(day);
        }
        answerList.add(que.size());

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
