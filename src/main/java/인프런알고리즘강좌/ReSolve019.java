package 인프런알고리즘강좌;

public class ReSolve019 {
    public static void main(String[] args) {
        int[] array = {51,89,71,98,95,79,59,84,65,67,82,72,90,62,64,71,72,77,75,51,80,50,77,81,68,66,56,57,70,57,70,96,67,74,94,93,57,58,96,62,56,97,70,95,94,60,75,90,85,62};
        int answer = solution(50, array);
        System.out.println(answer);
    }

    public static int solution(int x, int[] array) {
        int answer = 0;

        for(int i=0; i < array.length - 1; i++) {
            boolean isJang = true;
            for(int j=i+1; j < array.length; j++) {
                if(array[i] == array[j]) isJang = false;
                if(array[i] < array[j]) {
                    isJang = false;
                    break;
                }
            }
            if(isJang) answer++;
        }

        return answer;
    }
}
