public class algo04 {
    public static void main(String[] args) {
        int intNum = 5;

        // ex) 5! = 5*4*3*2*1; 팩토리얼값이란?
        // ex) 7! = 7*6*5*4*3*2*1;
        int factNum = 1;

        for(int i = intNum; i>0; i--) {
            factNum *= i;
        }
        System.out.println(factNum);
    }
}
