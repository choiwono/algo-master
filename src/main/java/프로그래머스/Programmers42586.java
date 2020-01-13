package 프로그래머스;

import java.util.*;

public class Programmers42586 {
    public static void main(String[] args) {
        int[] progress = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5, 10, 7};
        int[] result = solution(progress,speeds);
        for(int i : result){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds){
        // 첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
        // 두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 
        // 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
        // 세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
        // 따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
        Queue<Integer> que = new LinkedList<>();
        
        // 7 / 1 = 
        for(int i=0; i<progresses.length; i++){
            int rest = 100 - progresses[i];
            int deployDay = rest / speeds[i];
            if(rest % speeds[i] > 0){
                deployDay++;
            } 
            System.out.println(deployDay);
        }
        return new int[2];
    }
}
