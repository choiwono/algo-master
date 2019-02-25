public class BreakingRecords {
    static int[] breakingRecords(int[] scores){
        int max = 0;
        int min = 0;

        int[] result = new int[2];

        for(int i=0; i<scores.length; i++){
            if(i == 0){
                max = scores[i];
                min = scores[i];
            } else {
                if(scores[i] < min){
                    min = scores[i];
                    result[1]++;
                }
                if(scores[i] > max){
                    max = scores[i];
                    result[0]++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] scores = new int[]{3,4,21,36,10,28,35,5,24,42};
        int[] result = breakingRecords(scores);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
