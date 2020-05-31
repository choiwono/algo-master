package 인프런알고리즘강좌;

import java.util.*;

public class Solve014 {
    public static void main(String[] args) {
        solution();
    }

    public static int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        String str = Integer.toString(x);
        
        for(int i=str.length() - 1; i>=0; i--) {
            if(str.charAt(i) != '0') {
                sb.append(str.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static boolean isPrime(int x) {
        boolean flag = true;

        for(int i=2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }

        return flag;
    }

    public static int[] solution(){
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[2];
        int[] arr = {32, 55, 62, 3700, 250};
        
        for(int i=0; i<arr.length; i++) {
            int rever = reverse(arr[i]);
            if(isPrime(rever)) {
                list.add(rever);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(answer[0]+", "+answer[1]);
        return answer;
    }
}