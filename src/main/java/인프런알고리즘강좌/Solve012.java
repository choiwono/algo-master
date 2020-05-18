package 인프런알고리즘강좌;

public class Solve012 {
   public static void main(String[] args) {
        solution(4289);
   } 

   public static int solution(int n) {
       int answer = 0;
       int sum = 0;
       int cnt = 1;
       int digit = 9;
       int res = 0;
       // 0 + 9, 9보다 n이 작을 경우까지 계속 돈다..
       while(sum + digit < n) {
            // 4289, 9
            sum = sum + digit;
            res = res + (cnt * digit);
            cnt++;
            digit = digit * 10;
       }
       System.out.println("res : "+res+", n : "+n+", sum : "+sum+", cnt : "+cnt);
       res = res + ((n - sum) * cnt);
       
       return answer;
   }
}