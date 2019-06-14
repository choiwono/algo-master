package 기타;

public class ArrGraph {
    public static void main(String[] args) {
        int initSize = 6;
        ArrGraph arrGraph = new ArrGraph();
        arrGraph.solution(initSize);
    }

    public void solution(int initSize){
        Graph arrGraph = new Graph(initSize);
        arrGraph.put(1, 3);
        arrGraph.put(2, 3);
        arrGraph.put(2, 4);
        arrGraph.put(3, 4);
        arrGraph.put(3, 5);
        arrGraph.put(4, 5);
        arrGraph.put(4, 6);
        arrGraph.printGraphToAdjArr();
    }

    class Graph { // 배열 그래프
        private int[][] arrGraph;

        public Graph(int initSize){
            // 그래프 초기화
            // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
            // 배열의 index는 0 부터 시작이므로
            // ArrayIndexOutOfBoundsException 방지를 위해
            // 정점을 담는 인접행렬의 행과 열 size는 1을 더하여 초기화해줌
            this.arrGraph = new int[initSize+1][initSize+1];
        }

        public int[][] getGraph(){
            return this.arrGraph;
        }

        // 양방향 그래프
        public void put(int x,int y){
            arrGraph[x][y] = arrGraph[y][x] = 1;
        }
        // 단방향 그래프
        public void putSingle(int x, int y){
            arrGraph[x][y] = 1;
        }

        public void printGraphToAdjArr() {
            for(int i=0; i<arrGraph.length; i++) {
                for(int j=0; j<arrGraph[i].length; j++) {
                    System.out.print(" " + arrGraph[i][j]);
                }
                System.out.println();
            }
        }
    }
}
