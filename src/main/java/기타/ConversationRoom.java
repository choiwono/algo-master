package 기타;

import java.util.*;

public class ConversationRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.println(solution(N,arr));
    }

    public static int solution(int N, int[][] arr){
        int answer = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return Integer.compare(o1[0],o2[0]);
                }
                return Integer.compare(o1[1],o2[1]);
            }
        });

        int temp = -1;
        for(int i=0; i<arr.length; i++){
            if(temp <= arr[i][0]){
                temp = arr[i][1];
                answer++;
            }
        }
        return answer;
    }
}
