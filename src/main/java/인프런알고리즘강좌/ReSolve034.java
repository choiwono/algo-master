import java.util.*;

public class ReSolve034 {
  public static void main(String[] args) {
      solution(new int[]{13,23,11,7,5,15});
  }

  public static int[] solution(int[] num) {
      int[] answer = new int[num.length];
      
      for(int x = 0; x < num.length; x++) {
        for(int i = 0; i < num.length - x; i++) {
          int f1 = 0;
          int f2 = 0;
          if(i+1 > num.length - 1) break;
          if(num[i] > num[i+1]) {
            f1 = num[i];
            f2 = num[i+1];
            num[i] = f2;
            num[i+1] = f1;
          }
        }
      }

      return answer;
  }
}