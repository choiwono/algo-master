package 기타;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int cnt = 0;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                if(i==j) continue;
                if((ar[i]+ar[j]) % k == 0){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,6,1,2};
        int cnt = divisibleSumPairs(6,3,arr);
        System.out.println(cnt);
    }
}
