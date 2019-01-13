import java.util.*;

public class tetromino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 종이 가로칸을 받는다.
        int m = sc.nextInt(); // 종이 세로칸을 받는다.
        int[][] a = new int[n][m]; // 가로 x 세로 배열을 선언한다.
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt(); // 가로 x 세로칸 개수 만큼 값을 입력받는다.
            }
        }

        // 정사각형 4개를 이어붙인걸 테트로미노라고 한다. 회전이나 대칭이 가능하다.
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) { //
                if (j+3 < m) { // 일직선 ㅁㅁㅁㅁ
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i][j+3];
                    if (ans < temp) ans = temp;
                }
                if (i+3 < n) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+3][j];
                    if (ans < temp) ans = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+2][j];
                    if (ans < temp) ans = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+2];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j-1 >= 0) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j-1];
                    if (ans < temp) ans = temp;
                }
                if (i-1 >= 0 && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i-1][j+2];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j+1];
                    if (ans < temp) ans = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+2][j+1];
                    if (ans < temp) ans = temp;
                }
                if (i+1 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+1][j+1];
                    if (ans < temp) ans = temp;
                }
                if (i-1 >= 0 && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i-1][j+1] + a[i-1][j+2];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1];
                    if (ans < temp) ans = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+1][j+2];
                    if (ans < temp) ans = temp;
                }
                if (i+2 < n && j-1 >= 0) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j-1] + a[i+2][j-1];
                    if (ans < temp) ans = temp;
                }
                if (j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2];
                    if (i-1 >= 0) {
                        int temp2 = temp + a[i-1][j+1];
                        if (ans < temp2) ans = temp2;
                    }
                    if (i+1 < n) {
                        int temp2 = temp + a[i+1][j+1];
                        if (ans < temp2) ans = temp2;
                    }
                }
                if (i+2 < n) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j];
                    if (j+1 < m) {
                        int temp2 = temp + a[i+1][j+1];
                        if (ans < temp2) ans = temp2;
                    }
                    if (j-1 >= 0) {
                        int temp2 = temp + a[i+1][j-1];
                        if (ans < temp2) ans = temp2;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
