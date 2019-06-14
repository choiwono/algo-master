package 기타;

import java.util.ArrayList;

public class ListGraph {
    public static void main(String[] args) {
        int initSize = 6;
        ListGraph graph = new ListGraph();
        graph.solution(initSize);
    }

    public void solution(int initSize) {

        Graph graph = new Graph(initSize);
        graph.put(1,2);
        graph.put(1,3);
        graph.put(2,3);
        graph.put(2,4);
        graph.put(3,4);
        graph.put(3,5);
        graph.put(4,5);
        graph.put(4,6);

        graph.printGraphToAdjList();
    }

    class Graph { // ArrayList 안에 또 arrayList
        private ArrayList<ArrayList<Integer>> listGraph;

        public Graph(int initSize){
            // 그래프 초기화
            // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
            // ArrayList의 index는 0 부터 시작이므로
            // ArrayIndexOutOfBoundsException 방지를 위해
            // 정점을 담는 인접리스트의 size는 1을 더하여 초기화해줌
            // ex) initSize = 3
            // graph[0]
            // graph[1] -> 2 -> 3
            // graph[2] -> 1 -> 3 -> 4
            // graph[3] -> 1 -> 2 -> 4 -> 5
            this.listGraph = new ArrayList<ArrayList<Integer>>();
            for(int i=0; i<initSize+1; i++)
                listGraph.add(new ArrayList<Integer>());
        }

        // 그래프 return
        public ArrayList<ArrayList<Integer>> getGraph() {
            return this.listGraph;
        }
        // 그래프의 특정 노드 return
        public ArrayList<Integer> getNode(int i) {
            return this.listGraph.get(i);
        }
        // 양방향 추가
        public void put(int x, int y) {
            listGraph.get(x).add(y);
            listGraph.get(y).add(x);
        }
        // 단방향 추가
        public void putSingle(int x, int y){
            listGraph.get(x).add(y);
        }

        // 그래프 출력 (인접리스트)
        public void printGraphToAdjList() {
            for(int i=1; i<listGraph.size(); i++) {
                System.out.print("정점 " + i + "의 인접리스트");

                for(int j=0; j<listGraph.get(i).size(); j++) {
                    System.out.print(" -> " + listGraph.get(i).get(j));
                }
                System.out.println();
            }
        }
    }
}
