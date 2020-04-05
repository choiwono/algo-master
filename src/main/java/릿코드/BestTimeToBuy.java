package 릿코드;

import java.util.*;

public class BestTimeToBuy {
    public static void main(String[] args) {
        //solution("try  hello   world");
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }
    
    public static int maxProfit(int[] prices) {
        //Map<Integer, Integer> stock = new HashMap<>();
        int profit = 0;
        // 7을 사서 언제 파는지 이득인지 계산

        for(int i=0; i<prices.length; i++) {
            if(i+1 < prices.length) {
                //System.out.println("차이값 : "+prices[i]+","+prices[i+1]);
                if(prices[i+1] - prices[i] > 0) {
                    profit += prices[i+1] - prices[i];
                }
            }
        }

        return profit;
    }

}