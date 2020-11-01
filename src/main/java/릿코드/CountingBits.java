package 릿코드;
import java.util.*;

public class CountingBits {
    public static void main(String[] args) {
        countBits(5);
    }
    
    public static int[] countBits(int num) {
        int[] answer = new int[num+1];
  
        for(int i=0; i<= num; i++) {
          String str = Integer.toBinaryString(i);
          int count = 0;
          for(int j=0; j<str.length(); j++) {
            if(str.charAt(j) == '1') {
              count++;
            }
          }
          answer[i] = count;
        }
  
        return answer;
    }
}