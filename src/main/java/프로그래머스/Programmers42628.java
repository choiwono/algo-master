import java.util.*;

class Solution {
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

        // "I 숫자" 숫자삽입
        // "D 숫자" 큐에서 최대값을 삭제 1
        // "D 숫자" 큐에서 최소값을 삭제 -1
        // 모든 연산을 처리한후 큐가 비었을 경우 0,0
        // 비어있지 않을 경우 최대값, 최소값 리턴
        // 빈큐에 데이터를 삭제하는 연산이 주어질 경우 해당 연산 무시
        // 최대값, 최소값을 삭제하라는 연산에서 최대값 / 최소값이 둘 이상일 경우 하나만 삭제
        return answer;
    }
}
