public class Programmers03 {
    public static String solution(String cryptogram) {
        StringBuilder str = new StringBuilder(cryptogram);
        String answer = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    length -= 2;
                    i = 0;
                }
            }
        }

        answer = str.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("zyelleyz"));
    }
}
