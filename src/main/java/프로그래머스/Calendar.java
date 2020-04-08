package 프로그래머스;

public class Calendar {
    public static void main(String[] args) {
        solution(1,25);
    }

    public static String solution(int a, int b) {
        int[] month = { 31,29,31,30,31,30,31,31,30,31,30,31 };
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        if(a == 1 && b ==1) {
            return "FRI";
        }
        
        // 24 % 7 = 3
        // day[2]
        int totalDay = 0;

        for(int i=0; i < (a-1); i++) {
            totalDay += month[i]; 
        }
        // 31 - 24 = 7
        totalDay += (b-1);
        totalDay %= 7;
        
        System.out.println(totalDay);
        return day[totalDay];
    }
    // 2016 1월 1일은 금요일
    // 5월 24일 - 1, 1
}