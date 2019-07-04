package 백준기초문제100;

import java.util.*;

public class Boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> que = new LinkedList<>();
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++)
            str[i] = sc.next();

        int index = 0;
        String[] temp;

        int score = 1;
        int sum = 0;

        String str2 = "";

        while(true){
            if(index == str.length){
                break;
            }

            if(que.isEmpty()){
                temp = str[index].split("");
                for(int i=0; i<temp.length; i++) {
                    que.offer(temp[i]);
                }
                while(!que.isEmpty()) {
                    if(que.poll().equals("O")){
                        score++;
                        sum += score;
                    } else {
                        score = 0;
                    }
                }
                sum = 0;
                System.out.println(sum);
                index++;
            }
        }
    }
}
