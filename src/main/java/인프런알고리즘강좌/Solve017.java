package 인프런알고리즘강좌;

public class Solve017 {
    public static void main(String[] args) {
        solution(10, 55);
        solution(20, 350);
        solution(100, 5050); 
    }  

    public static String solution(int number, int answer) {
        //String flag = "NO";
        int total = 0;
        for(int i=1; i<=number; i++) {
            total += i;
        }
        
        if(answer == total){
            System.out.println("YES");
            return "YES";
        }
        System.out.println("NO");
        return "NO";
    }
}