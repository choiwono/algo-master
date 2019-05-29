package 프로그래머스;

import java.util.Arrays;

public class Programmers42748 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = solution(array,commands);
        for(int i : answer){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            int temp[] = new int[end - start + 1];

            int a = 0;

            for(int j = start-1; j<end; j++){
                temp[a++] = array[j];
            } // 2 3 5 6
            Arrays.sort(temp);
            answer[i] = temp[k-1];
        }

        return answer;
    }
}
