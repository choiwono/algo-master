package 릿코드;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        solution(new int[]{ 1,2 });
    }

    public static int solution(int[] x) {
        int diff = 0;
        int profit = 0;

        for(int i=0; i<x.length; i++) {
            int buyDay = x[i];
            for(int j=i+1; j<x.length; j++) {
                diff = x[j] - buyDay;
                profit = Math.max(profit, diff);
            }
        }

        return profit;
    }
}
