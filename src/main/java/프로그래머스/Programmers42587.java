package 프로그래머스;

import java.util.*;

public class Programmers42587 {
    public int solution(int[] priorities, int location){
        PriorityQueue<pointer> que = new PriorityQueue<>();
        int answer = 0;
        // x,y
        for(int i=0; i<priorities.length; i++){
            que.add(new pointer(i,priorities[i]));
        }
        
        return answer;
    }

    class pointer{
        int x;
        int y;
        public pointer(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[] priority = {1,1,9,1,1,1};
        int location = 0;
        Programmers42587 programers = new Programmers42587();
    }
}
