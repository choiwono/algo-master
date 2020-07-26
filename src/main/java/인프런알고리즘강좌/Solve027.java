public class Solve027 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        int n = 5;
        int[] answer = new int[n+1];
        boolean isPrime = false;

        for(int i = n; i>= 2; i--) {
          int num = i;

          for(int j = 2; j<=n; j++) {
            while(num % j == 0){
              answer[j]++;
              num /= j;
            }
            if(num == 1) break;
          }
        }

        System.out.print(n+"!=");

        for(int i=2; i <= n; i++) {
          isPrime = true;
          for(int j=2; j<i; j++) {
            if(i % j == 0) {
              isPrime = false;
              break;
            }
          }

          if(isPrime) {
              System.out.print(answer[i]);
          }
        }
    }
}