package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;

public class Programmers42577 {
    public static boolean solution(String[] phoneBook){
        Arrays.sort(phoneBook);
        // 두개의 배열을 비교하는 방법..
        for(int i=0; i<phoneBook.length; i++){
            for(int j=i+1; j<phoneBook.length; j++){
                if(phoneBook[j].startsWith(phoneBook[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //String[] participant = {"12","123","1235","567","88"};
        String[] participant = {"123","456","789"};
        System.out.println(solution(participant));
    }
}
