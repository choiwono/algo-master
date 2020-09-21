package 인프런알고리즘강좌;

public class ReSolve011 {
    public static void main(String[] args) {
        solution(96353638);
    }

    public static int solution(int x) {
        //int div = 0;
        //int rest = 0;
        //int cnt = 0;
        long beforeTime = System.currentTimeMillis();

        // 96353638
        // 한번에 계산하는 방법..


//        for(int i=1; i<=x; i++) {
//            div = i / 10;
//            rest = i % 10;
//            //int tempLength = Integer.toString(div).length();
//            //int restLength = Integer.toString(rest).length();
//            // 자릿수가 나옴.. 10으로 나눌때
//            // 10자리 단위로..
//
//            if(div > 0) {
//                cnt += div + rest;
//                continue;
//            }
//
//            cnt++;
//        }
        int sum=0, tempCnt=1, digit = 9, res = 0;
        while(sum + digit < x) {
            sum = sum + digit;
            res = res + (tempCnt * digit);
            tempCnt++;
            digit = digit * 10;
        }
        System.out.println("res : "+res+", x : "+x+", sum :"+sum);
        System.out.println((x-sum) * tempCnt);

        //res = res + ((x - sum) * tempCnt);


        //System.out.println(res);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        //System.out.println("시간차이(m) : "+secDiffTime);

//        for(int i=1; i<=x; i++) {
//            div = i;
//            while(div > 0) {
//                div = div / 10;
//                cnt++;
//            }
//        }
        //System.out.println(res);

        return res;
    }
}
