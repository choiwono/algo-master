package 기타;

import java.util.*;
import java.util.LinkedList;

public class DfsExam {
    private int V; // 노드의 개수 ( 정점의 갯수)
    private LinkedList<Integer> adj[]; // 인접 리스트
    public DfsExam(int v){
        V = v;
        adj = new LinkedList[v]; // 연결리스트 만큼 선언
        for (int i=0; i<v; ++i) // 인접 리스트 초기화
            adj[i] = new LinkedList();
    }


    // 노드를 연결 v->w
    void addEdge(int v, int w) { adj[v].add(w); }

    void DFSUtil(int v, boolean visited[]) {
        // 현재 노드를 방문한것으로 표시하고 true로 변경
        visited[v] = true;
        System.out.println(v+ " ");

        // 방문한 노드와 인전합 노드를 모두 가져온다
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()) {
            int n = i.next();
            if(!visited[n])
                DFSUtil(n,visited); // 방문한지 않은곳이 있으면 다시 방문한다.
        }
    }

    // 주어진 노드를 시작노드로 DFS 탐색
    void DFS(int v){
        // 노드의 방문 여부 판단 ( 초깃값 : false )
        boolean visited[] = new boolean[V];

        // v를 시작 노드로 DFSUtil 순환 호출
        DFSUtil(v,visited);
    }

    // DFS 탐색
    void DFS(){
        boolean visited[] = new boolean[V];
        for(int i=0; i<V; ++i)
            if(visited[i] == false)
                DFSUtil(i,visited);
    }

    public static void main(String[] args) {
        DfsExam g = new DfsExam(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.DFS(2);
        g.DFS();
    }
}
