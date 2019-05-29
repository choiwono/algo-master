package 기타;

import java.util.*;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr){
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        int max = 0;
        for(int i=0; i<arr.size(); i++){
            Integer count = treeMap.get(arr.get(i));
            if(count == null){
                count = 0;
            }
            treeMap.put(arr.get(i), count+1);
        }
        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            System.out.println("key : " + entry.getKey() + " / value : " + entry.getValue());
            max = Collections.max(treeMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(migratoryBirds(list));
    }
}
