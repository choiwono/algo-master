import java.util.*;

public class Algo1260 {
    static ArrayList<Integer>[] a; // 정점 배열
    static boolean[] c; // 탐색여부를 체크할 배열 선언
    public static void dfs(int x){ // 깊이 탐색
        if(c[x]){
            return;
        }
        c[x] = true;
        System.out.println(x+" ");
        for(int y : a[x]){
            if(c[y] == false){
                dfs(y);
            }
        }
    }

    public static void bfs(int start){ // 넓이 탐색
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        c[start] = true;
        while(!q.isEmpty()){
            int x = q.remove();
            System.out.println(x+" ");
            for(int y : a[x]){
                if(c[y] == false){ // 탐색을 안했을 경우
                    c[y] = true; // 탐색으로 변경
                    q.add(y); // y값을 q에 추가한다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총 숫자
        int m = sc.nextInt(); // 간선의 숫자
        int start = sc.nextInt(); // 탐색을 시작할 번호
        a = (ArrayList<Integer>[]) new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            a[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v); // 양방향이기때문에 양쪽모두에게 값을 추가한다
            a[v].add(u); // 동일7
        }
        for(int i=1; i<=n; i++){
            Collections.sort(a[i]); // 정렬
        }
        c = new boolean[n+1]; // 탐색배열 초기화
        dfs(start); // 탐색
        System.out.println(); // 출력
        c = new boolean[n+1]; // 동일
        bfs(start); // 동일
        System.out.println(); // 동일
    }

}
