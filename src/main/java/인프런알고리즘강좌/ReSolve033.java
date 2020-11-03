package 인프런알고리즘강좌;

import java.util.*;

public class ReSolve033 {
    public static void main(String[] args) {
        solution(new int[]{97,81,99,82,91,61,61,84,88,93,83,52,93,67,92,79,56,83,92,79,93,66,93,91,50,92,52,94,75,99,72,70,61,91,60,50,53,65,55,87,62,57,82,67,72,77,51,81,52,91,80,88,62,73,63,64,90,54,71,52,72,99,85,72,80,78,99,74,95,55,95,61,91,81,95,91,54,80,79,86,93,78,92,71,95,59,96,87,78,91});
    }
  
    public static int solution(int[] num) {
        int answer = 0;
        Set set = new HashSet();
  
        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }
  
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
  
        answer = list.get(list.size() - 3);
        System.out.println(answer);
        // for(int i : list) {
        //   System.out.println(i);
        // }
  
        return answer;
    }
}