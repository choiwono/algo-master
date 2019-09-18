package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers12909 {
    public static void main(String[] args){
        System.out.println(solution("(())()"));

    }
    public static boolean solution(String s){
       int sum = 0;

       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == '('){
               sum++;
           } else if(s.charAt(i) == ')'){
               if(sum <= 0)
                   return false;
               else
                   sum --;
           }
       }

       if(sum == 0)
           return true;
       else
           return false;
    }
}
