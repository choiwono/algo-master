package 인프런알고리즘강좌;

import java.util.*;

public class Solve009 {
    public static void main(String[] args) {
        solution(8);
    }

    public static void solution(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);

        for(int i=2; i<=number; i++) {
            int cnt = 0;
            for(int j=1; j<=i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            list.add(cnt);
        }

        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}