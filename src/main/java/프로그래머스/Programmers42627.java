package 프로그래머스;

import java.util.*;

public class Programmers42627 {
    public static void main(String[] args) {
        int[][] jobs = {{1,9},{2,6},{0,3}};
        //solution(jobs);
        Programmers42627 program = new Programmers42627();
        System.out.println(program.solution(jobs));
    }

    public int solution(int[][] jobs){
        int answer = 0;
        // 요청시간 순대로 정렬해보자...
        // 요청시간이 같은 경우 수행시간 순대로..
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0]){
                    return -1;
                } else if(o1[0] == o2[0]){
                    if(o1[1] < o2[1]){
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return 1;
            }
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] < o2[1]){
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        /*for(int i=0; i<jobs.length; i++){
           // System.out.println(jobs[i][0]+":"+jobs[i][1]);
            pq.offer(new int[]{jobs[i][0],jobs[i][1]});
        }*/

        int index = 0;
        int time = 0;

        while(true){
            while(index < jobs.length && jobs[index][0] <= time){
                pq.offer(new int[]{jobs[index][0],jobs[index][1]});
                index++;
            }
            if(pq.size() == 0){
                time = jobs[index][0];
                continue;
            }

            int[] answer2 = pq.poll();

            if(answer2[0] <= time){
                time += answer2[1];
                answer += time - answer2[0];
            }
            if(index == jobs.length && pq.size() == 0)
                break;
        }
        return answer / jobs.length;
    }
}
