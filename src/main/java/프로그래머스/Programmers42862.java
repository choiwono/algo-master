package 프로그래머스;

import java.util.*;

public class Programmers42862 {
    public static void main(String[] args) {
        int n = 7;
        int[] lost = {2,3,4};
        int[] reserve = {1,2,3,6};
        System.out.println(solution(n,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve){
        //int answer = 0;
        int noCloth = lost.length;
        boolean[] check = new boolean[reserve.length];
        // 정렬로 순서를 맞춘다
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 3,4,5
        // 3,5,7

        
        for(int i=0; i<lost.length; i++) {
            
            for(int j=0; j<reserve.length; j++) {
                // 잃어버린 놈 == 가져온놈이 같은경우
                if(lost[i] == reserve[j] && !check[j]) {
                    System.out.println(lost[i]+","+reserve[j]);
                    noCloth--;
                    check[j] = true;
                    break;
                } else {
                    if(!check[j]) {
                        if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                            System.out.println(lost[i] + "," + reserve[j]);
                            check[j] = true;
                            noCloth--;
                            break;
                        }
                    }
                }
            }
        }
        //System.out.println(noCloth);

        return n - noCloth;
    }
}
