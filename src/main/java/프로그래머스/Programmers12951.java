package 프로그래머스;

public class Programmers12951 {
    public static void main(String[] args) {
        String s = "3people  unFollowed  me";
        Programmers12951 prg = new Programmers12951();
        System.out.println(prg.solution(s));
    }

    public String solution(String s){
        boolean isCheck = true;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(i == 0 || isCheck){
                sb.append(Character.toUpperCase(s.charAt(i)));
                isCheck = false;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            if(s.charAt(i) == ' '){
                isCheck = true;
            }
        }
        return sb.toString();
    }
}
