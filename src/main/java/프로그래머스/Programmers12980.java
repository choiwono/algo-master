package 프로그래머스;

public class Programmers12980 {
    public static void main(String[] args) {
        Programmers12980 programmers = new Programmers12980();
        int answer = programmers.solution(5000);
        System.out.println(answer);
    }
    public int solution(int distance) {
        return Integer.bitCount(distance);
    }
}
