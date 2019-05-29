package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;

public class Programmers2 {
    public static void main(String[] args) {
        char aString = 65 ;

        while(true){
            if(aString == 91)
                aString = 97 ;
            String str = String.valueOf(aString) ;
            System.out.println(str) ;
            aString++ ;
            if(aString > 122)
                break ;
        }
    }

    public static String solution(String word) {
        String result = "";
        char aString = 65;

        return result;
    }
}
