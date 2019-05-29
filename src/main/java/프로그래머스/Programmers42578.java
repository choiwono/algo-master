package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Programmers42578 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }

        for(int i : map.values()){
            answer *= i+1;
        }
        // 2 * 1= 2, 3 * 2 = 6
        //
        // 3개, 규칙을 찾아보자... 3개로 입을 수 있는 규칙 3 * 1.. 종류가 1개니까
        // 종류별로 값이 나옴.
        // 3+1 * 1+1 * 2+1
        // 4 * 2, 8 * 3 = 24
        return answer-1;
    }
    // 3, 2, 1

    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"},{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution(clothes);
        //System.out.println();
    }
}
