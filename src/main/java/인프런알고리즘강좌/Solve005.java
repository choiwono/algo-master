package 인프런알고리즘강좌;

public class Solve005 {
    public static void main(String[] args) {
        solution("061102-3575393");
    }

    public static String solution(String number) {
        String answer = "";
        String sex = "";
        int age = 0;
        int[] registNumber = {1,2,3,4};
        int yyyy = 2019;
        // 기준 2019년
        String[] stringSplit = number.split("-");
        
        String frontNumber = stringSplit[0].substring(0,2);
        int backNumber = Integer.parseInt(stringSplit[1].substring(0,1));
        
        for(int i = 0; i < registNumber.length; i++) {
            if(backNumber == registNumber[i]) {
                if(backNumber == 2 || backNumber == 4) {
                    sex = "W";
                } else {
                    sex = "M";
                }

                String str = backNumber == 2 ? "19"+frontNumber : "20"+frontNumber;
                age = yyyy - Integer.parseInt(str) + 1;
            }
        }
        return answer;
    }
}