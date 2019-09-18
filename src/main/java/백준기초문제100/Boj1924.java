package 백준기초문제100;

import java.util.*;

public class Boj1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] fir = new int[]{1,3,5,7,8,10,12}; // 31
        int[] two = new int[]{4,6,9,11}; // 30

        if(x-1 == 2){
            sum += 28;
        }

        for(int i=x-1; i>0; i--){
            for(int j=0; j<fir.length; j++){
                if(fir[j] == i)
                    sum += 31;
            }
        }

        for(int i=x-1; i>0; i--){
            for(int j=0; j<two.length; j++){
                if(two[j] == i)
                    sum += 30;
            }
        }
        sum += y;
        System.out.println(day[sum % 7]);
    }
}
