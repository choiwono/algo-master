public class Solve29 {
    public static void main(String[] args) {
        int N = 30;
        solution(N);
      };
      
      public static void solution(int number) {
          int answer = 0;
          for(int i = 1; i <= number; i++) {
              String str = Integer.toString(i);    
              for(int j=0; j < str.length(); j++) {
                if(str.charAt(j) == '3') answer++;
              }
          };
          System.out.println(answer); 
      };
}