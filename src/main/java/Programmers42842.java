public class Programmers42842 {
    public static void main(String[] args) {
        solution(10,2);
    }

    public static int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int sum = brown + red;
        int height = 0;
        for(int i=1; i<brown; i++){
            height = sum / i; // 12 / 1, 12 / 2, 12 / 3
            if((height-2) * (i-2) == red){
                answer[0] = i;
                answer[1] = height;
            }
        }

        // 2, 4-2, 3-2 2*1
        return answer;
    }
}
