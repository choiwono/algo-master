package 백준기초문제100;

import java.util.*;

public class Boj1946 {
    // 모든 경우의 수를 다 비교한다..
    // 하나의 케이스가 1인 경우는 제외.. 무조건 가능
    // 둘중에 하나를 모든 지원자와 비교 했을 때 서류 혹은 면접이 높으면 가능.. 낮을 경우 제외..
    static int T;
    static int N;
    static int[][] grade;
    static List<Integer> answerList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        answerList = new ArrayList<>();

        for(int i=0; i<T; i++){
            N = sc.nextInt();
            grade = new int[N][2];
            for(int j=0; j<N; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                grade[j][0] = a;
                grade[j][1] = b;
            }

            Arrays.sort(grade, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            // 1,4  2,3  3,2  4,1  5,5
            int answer = 0;
            for(int x=grade.length - 1; x>=0; i--){
                //System.out.println(grade[i][0]);
                boolean flag = true;

                for(int y=x-1; y>=0; y--){
                    //System.out.println(grade[j][1]);
                    if(grade[x][1] > grade[y][1]) {
                        flag = false;
                    }
                }
                if(flag) answer++;
            }
            //System.out.println(answer);
            answerList.add(answer);
        }

        for(int i=0; i<answerList.size(); i++){
            System.out.println(answerList.get(i));
        }
    }
}
