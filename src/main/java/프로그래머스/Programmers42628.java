package 프로그래머스;

import java.util.*;

public class Programmers42628 {
    public static void main(String[] args) {
        //String[] operations = {"I 16","D 1"};
        String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] answer = solution(operations2);
        System.out.println(answer[0]+","+answer[1]);
    }

    public static int[] solution(String[] operations){
        int[] answer = {0,0};
        PriorityQueue<Integer> minQue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQue = new PriorityQueue<>(Comparator.reverseOrder());

        int index = 0;
        while(true){
            if(index == operations.length){
                if(minQue.size() >= 2){
                    return new int[]{maxQue.poll(),minQue.poll()};
                }
                break;
            }
            String[] str = operations[index].split(" ");

            if(str[0].equals("I")){
                minQue.add(Integer.parseInt(str[1]));
                maxQue.add(Integer.parseInt(str[1]));
            }
            if(str[0].equals("D") && !minQue.isEmpty()){
                if(str[1].equals("1")){
                    int max = maxQue.poll();
                    minQue.remove(max);
                } else if(str[1].equals("-1")){
                    int min = minQue.poll();
                    maxQue.remove(min);
                }
            }
            index++;
        }
        return answer;
    }
}
