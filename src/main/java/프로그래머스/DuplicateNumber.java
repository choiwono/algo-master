package 프로그래머스;

import java.util.*;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        //int[] answer = {};
        ArrayList<Integer> newArr = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<arr.length; i++) {
            que.add(arr[i]);
        }

        int temp = 0;

        while(!que.isEmpty()) {
            temp = que.poll();

            if(que.size() == 1) {
                newArr.add(temp);
            }

            //System.out.println(temp == que.peek());
            if(temp == que.peek()) {
                que.poll();
            } else {   
                newArr.add(temp);
            }
            //System.out.println(temp);
        }

        int[] answer = new int[newArr.size()];

        for(int i=0; i < newArr.size(); i++) {
            System.out.println(newArr.get(i));
            answer[i] = newArr.get(i);
        }

        return answer;
    }
}