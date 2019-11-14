package 프로그래머스;

public class Programmers62048 {
    public static void main(String[] args) {
        // 1cm x 1cm
        long answer = solution(8,12);
        System.out.println(answer);
    }

    public static long solution(int w, int h){
        long total = (long)w * (long)h;
        // 가로, 세로

        return total - ((long)w + (long)h - gcd(w,h));
    }

    public static long gcd(int w, int h){
        if(w == 0) return h;
        return gcd(h % w, w);
    }
}
