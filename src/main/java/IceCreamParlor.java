import java.util.*;

public class IceCreamParlor {
    static List<Integer> gradingStudents(int[] arr, int[] brr) {
            HashMap<Integer,Integer> first = new HashMap<>();

            for(int i=0; i<arr.length; i++){
                Integer count = first.get(arr[i]);
                if(count == null){
                    count = 0;
                }
                first.put(arr[i], count+1);
            }

            HashMap<Integer, Integer> second = new HashMap<>();

            for(int j=0; j<brr.length; j++){
                Integer count = second.get(brr[j]);
                if(count == null){
                    count = 0;
                }
                second.put(brr[j],count +1);
            }

            List<Integer> missing = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : second.entrySet()){
                int count = entry.getValue();
                int number = entry.getKey();
                if(first.get(number) == null || first.get(number) < count){
                    missing.add(number);
                }
            }
            Collections.sort(missing);
            return missing;
    }

    public static void main(String[] args) {

    }
}
