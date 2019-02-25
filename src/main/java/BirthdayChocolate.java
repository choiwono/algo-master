import java.util.*;

public class BirthdayChocolate {
    static int birthdayChocolate(List<Integer> s, int d, int m) {
        // d 합계
        // m 연속되야 하는 수
        int count = 0;

        for (int i = 0; i < (s.size()-m+1); i++) {
            int sum = 0;
            for (int j = i; j < (i+m); j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> t = new ArrayList<>();
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(3);
        t.add(2);
        int cnt =  birthdayChocolate(t,3,2);
        System.out.println(cnt);
    }
}
