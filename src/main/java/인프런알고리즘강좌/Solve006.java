package 인프런알고리즘강좌;

public class Solve006 {

    public static void main(String[] args) {
        String str = "g0000enTs8eSoft";
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        String answer = "";
        int num = 0;

        for(int i = 0; i < number.length; i++ ) {
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == number[i]) {
                    answer += number[i];
                }
            }
        }
        // 첫자리가 0인경우..
        // 두번째 자리도 0일 수가 있다..
        // 000000 이런식으로..
        //System.out.println(answer.substring(0,1) == "0");

        if(answer.substring(0,1).equals("0")) {
            //System.out.println("체크");
            for(int i = 1; i < answer.length(); i++) {
                if( answer.charAt(i) != '0' ) {
                    System.out.println(i);
                    num = i;
                }
            }
            // 총길이 5.. -1
            // System.out.println(answer.substring(num));
        }
        

        num = Integer.parseInt(answer);

        //System.out.println(num);
        //System.out.println(answer);
    }

}