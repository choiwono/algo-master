public class Solve028 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        // 12
        int n = 12;
        int max = 1;
        int cnt = 0;

        for(int i = n; i >= 1; i-- ) {
            max *= i;
        }
        
        String str = Integer.toString(max);
        
        for(int i=str.length() - 1; i >= 0; i--) {
          if(str.charAt(i) == '0'){
            cnt++;
          } else {
            break;
          }
        }
        
        System.out.println(cnt);
    }
}