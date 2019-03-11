import java.util.*;

public class Chicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = X*A+B*Y;

        for(int i=1; i<=100000; i++){
            int price = 2*i*C + Math.max(0,X-i)*A + Math.max(0,Y-i)*B;
            if(ans > price) ans = price;
        }
        System.out.println(ans);
    }
}
