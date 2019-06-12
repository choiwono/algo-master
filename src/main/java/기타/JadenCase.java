package 기타;

public class JadenCase {
    public static void main(String[] args) {
        String str = "3people unFollowed me";
        JadenCase jadenCase = new JadenCase();
        jadenCase.solution(str);
    }

    public String solution(String str){

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        // 공백이 앞이나 뒤로 들어가는경우
        // 공백이 사이에 여러개 들어가는 경우
        String[] str2 = str.split("");
        str2[0] = str2[0].toUpperCase();
        for(int i=0; i<str2.length; i++){
            if(str2[i].equals(" ")){
                if(i != str2.length - 1){
                    str2[i + 1] = str2[i + 1].toUpperCase();
                }
            }
            sb.append(str2[i]);
        }
        //System.out.println(sb.toString());

        return sb.toString();
    }
}
