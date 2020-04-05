package 프로그래머스;

public class Programmers12931 {
    public static void main(String[] args) {
        //solution("try  hello   world");
        solution(987);
    }
    
    public static int solution(int n) {
       int answer = 0;
       String str = Integer.toString(n); 
       
       for(int i=0; i<str.length(); i++) {
          System.out.println(str.charAt(i));
          answer += Character.getNumericValue(str.charAt(i));
       }
       
       return answer;
    }

}