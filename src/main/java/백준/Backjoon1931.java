package 백준;

import java.util.*;

public class Backjoon1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int[][] arr = new int[N][2];
        /*for(int i = 0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }*/
        int N = 11;
        int[][] arr = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}};
        System.out.println(solution(N, arr));
    }

    public static int solution(int N, int[][] arr) {
        int answer = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //return 0;
                if (o1[1] == o2[1])
                    return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int temp = -1;
        // 임시값을 -1을 넣자..!! 기억 또 기억.. 혹은
        // 배열에서 값 체크를 할때 -1을 넣어도 좋음

        for (int i = 0; i < arr.length; i++) {
            if (temp <= arr[i][0]) {
                answer++;
                temp = arr[i][1];
            }
        }
        return answer;
    }
}
