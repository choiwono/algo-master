package 인프런알고리즘강좌;

public class Solve007 {
    public static void main(String[] args) {
        solution("bE    au T I fu   L");
    }

    public static String solution(String str) {
        String answer = "";
        // 알파벳은 소문자로 변경, 공백은 없애기
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                //System.out.println("공백 : "+str.charAt(i));
                answer += str.charAt(i);
            }
        }
        answer = answer.toLowerCase();
        
        return answer;
    }
}