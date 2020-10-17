package 인프런알고리즘강좌;

public class ReSolve18 {
    public static void main(String[] args) {
        int[] array = {82,174,62,203,196,47,85,185,15,124,148,73,59,110,18,102,42,63,200,90,126,117,106,18,120,146,24,33,97,65,88,201,84,155,39,55,147,11,184,87,137,135,180,49,168,105,163,138,36,76,169,141,160,122,150,155,159,37,181,129,198,117,189,178,200,130,106,60,49,123,203,79,152,158,176,91,134,152,109,185};
        int answer = solution(80, 120, array);
        System.out.println(answer);
    }

    public static int solution(int length, int warning, int[] array) {
        int warningCount = 0;
        int answer = 0;

        for(int i=0; i<length; i++) {
            if(array[i] > warning) {
                warningCount++;
            } else {
                answer = Math.max(warningCount, answer);
                warningCount = 0;
            }
        }

        if(answer > 0) return answer;

        return -1;
    }
}
