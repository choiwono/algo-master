package 기타;

public class Carpet {
    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        int[] n = carpet.solution(8,1);
        System.out.println(n[0]+","+n[1]);
    }

    public int[] solution(int brown, int red){
        int[] answer = new int[2];

        int sum = brown+red;
        for(int i=3; i<=sum; i++){

            if(sum % i == 0){
                if((i - 2) * ((sum / i) - 2) == red && i >= sum/i){
                    return new int[]{i,sum/i};
                }
            }
        }
        return answer;
    }
}
