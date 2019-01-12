import java.util.Scanner;

public class plus123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Integer value = scanner.nextInt();
            int sum = 0;
            int goal = go(sum,value);
            System.out.println(goal);
        }
    }

    public static int go(int sum, int goal) {
        if(sum > goal) return 0;
        if(sum == goal) return 1;
        int now = 0;
        for (int i=1; i<=3; i++) {
            now += go(sum+i,goal);
        }
        return now;
    }
}
