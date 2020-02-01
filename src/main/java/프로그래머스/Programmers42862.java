package 프로그래머스;

import java.util.*;

public class Programmers42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve){
        //int answer = 0;
        int noCloth = lost.length;
        boolean[] check = new boolean[reserve.length];
        // 정렬로 순서를 맞춘다
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                // 잃어버린 놈 == 가져온놈이 같은경우
                if(lost[i] == reserve[j] && !check[j]) {
                    System.out.println(lost[i]+","+reserve[j]);
                    noCloth--;
                    check[j] = true;
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++) {
            //System.out.println(check[i]);
            for(int j=0; j<reserve.length; j++) {
                if(!check[j] && lost[i] > -1) {
                    if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                        System.out.println(lost[i] + "," + reserve[j]);
                        check[j] = true;
                        noCloth--;
                        break;
                    }
                }
            }
        }

        return n - noCloth;
    }
}
