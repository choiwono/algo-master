package 프로그래머스;

import java.util.*;

public class Programmers42579 {
    public static void main(String[] args) {
        String[] genres = {"classic","pop","classic","classic","pop"};
        int[] playes = {500,600,150,800,2500};
        Programmers42579 program = new Programmers42579();
        program.solution(genres,playes);
    }

    public int[] solution(String[] genres, int[] plays){

        List<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<genres.length; i++){
            if(map.containsKey(genres[i])) {
                map.put(genres[i], map.get(genres[i])+plays[i]);
            } else {
                map.put(genres[i],plays[i]);
            }
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        for(String key : keyList){
            for(int i=0; i<genres.length; i++){
                if(genres[i].contains(key)){
                    priorityQueue.offer(new Pair(i,plays[i]));
                }
                if(i == genres.length - 1){
                    for(int k=0; k<2; k++){
                        if(priorityQueue.isEmpty()){
                            break;
                        }
                        list.add(priorityQueue.poll().location);
                    }
                    priorityQueue.clear();
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public class Pair implements Comparable<Pair>{
        private int location;
        private int plays;

        public Pair(int location, int plays){
            this.location = location;
            this.plays = plays;
        }

        @Override
        public int compareTo(Pair pair){
            if(this.plays > pair.plays){
                return -1;
            } else if(this.plays < pair.plays){
                return 1;
            } else {
                return 0;
            }
        }
    }
}
