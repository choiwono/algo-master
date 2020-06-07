package 인프런알고리즘강좌;

import java.util.*;

public class Solve020 {
    public static void main(String[] args) {
        int[] A = {2,3,3,1,3};
        int[] B = {1,1,2,2,3};

        solution(5, A, B);
    }

    public static int rockPaperScissors(int A, int B) {
        // 0 : A가 이김, 1 : B가 이김, 2 : Draw;
        int aWin = 0;
        int bWin = 1;
        int D = 2;
        // 1 가위, 2 바위, 3 보
        
        if(A == 1 && B == 3) return aWin;
        if(A == 2 && B == 1) return aWin;
        if(A == 3 && B == 2) return aWin;

        if(B == 1 && A == 3) return bWin;
        if(B == 2 && A == 1) return bWin;
        if(B == 3 && A == 2) return bWin;

        return D;
    }

    public static void solution(int count, int[] A, int[] B) {
        ArrayList<Integer> arrays = new ArrayList<>();
        
        for(int i=0; i<count; i++) {
            int result = rockPaperScissors(A[i], B[i]);
            arrays.add(result);
        }

        for(int i=0; i<arrays.size(); i++) {
            if(arrays.get(i) == 0) System.out.println("A");
            if(arrays.get(i) == 1) System.out.println("B");
            if(arrays.get(i) == 2) System.out.println("D");
        }
    }
}