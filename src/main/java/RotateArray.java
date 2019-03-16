import java.util.*;

public class RotateArray {
    static int solution(int[] A) {
        // write your code in Java SE 8
        //Set<Integer> set = new HashSet<>();
        List<Integer> set = new ArrayList<>();

        for(int i : A){
            if(set.contains(i)){
                set.remove((Object)i);
            } else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] a = {9,3,9,3,9,7,9};
        System.out.println(solution(a));
    }
}
