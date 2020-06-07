package 인프런알고리즘강좌;

public class Solve021 {
    public static void main(String[] args) {
        int[] aArrays = {9,1,7,2,6,3,0,4,8,5};
        int[] bArrays = {6,3,9,2,1,0,7,4,8,5};

        solution(aArrays, bArrays);
    }

    public static void solution(int[] a, int[] b) {
        // 카드를 뒤집어서 승점이 높은쪽이 3점
        // 패자는 0점
        // 숫자가 동일한 경우 1점
        // 라운드가 모두 끝나고 점수가 동일한 경우 마지막 라운드의 승자가 이기게 된다.
        int A = 0;
        int B = 0;
        String LAST = "";

        for(int i = 0; i < 10; i++) {
            if(a[i] > b[i]){ 
                A += 3;
                LAST = "A";
            }

            if(a[i] < b[i]){
                B += 3;
                LAST = "B";
            }

            if(a[i] == b[i]) {
                A += 1;
                B += 1;
            }
        }

        if(A > B) System.out.println("A");
        if(B > A) System.out.println("B");
        if(A == B) System.out.println(LAST); 
    }
}