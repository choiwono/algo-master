public class ReSolve031 {
    public static void main(String[] args) {
        solution("C2H4");
    }

    public static int solution(String str) {
        int answer = 0;
        //C 12, H 1g
        int hIdx = str.indexOf("H");
        int cIdx = str.indexOf("C");
        
        String C = str.substring(cIdx+1, hIdx);
        String H = str.substring(hIdx+1);
        
        if(C.equals("")) {
          answer += 1 * 12;
        } else {
          answer += 12 * Integer.parseInt(C);
        }

        if(H.equals("")) {
          answer += 1;
        } else {
          answer += 1 * Integer.parseInt(H);
        }

        return answer;
    }
}