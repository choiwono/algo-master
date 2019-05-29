package 기타;

import java.util.*;

public class Solider {
    static int solution(int[] ranks){
        HashMap<Integer,Integer> check = new HashMap<>();

        for(int i=0; i<ranks.length; i++){
            Integer count = check.get(ranks[i]);
            if(count == null){
                count = 0;
            }
            check.put(ranks[i], count+1);
        }

        int result = 0;
        for(Map.Entry<Integer, Integer> entry : check.entrySet()){
            int count = entry.getValue();
            int number = entry.getKey();
            if(check.containsKey(number) == check.containsKey(number+1)){
                result += count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0; j<n; j++){
            arr[j] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
