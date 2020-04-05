package 릿코드;

import java.util.*;

public class HappyNumber {
    public static void main(String[] args){
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        //int maxSum = Integer.MAX_VALUE;
        long t = n;
        Set<Long> seen = new HashSet<Long>();

        while(seen.add(t)) {
            t = process(t);
            if (t==1) {
                return true;
            }
        }

        return false;
    }

    public static long process(long n) {
        long res = 0;
        while(n > 0) {
            long rem = n % 10;
            res += rem * rem;
            n /= 10;
        }

        return res;
    }
}