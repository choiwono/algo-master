public class algo02 {
    public static void main(String[] args) {

        int num1, num2;
        num1 = 8;
        num2 = 32;

        // 두수의 최대공약수를 구할때는 둘중에 어떤수가 큰지 작은지를 판별해야한다.

        int small;
        int big;

        if(num1 > num2) {
            big = num1;
            small = num2;
        } else {
            big = num2;
            small = num1;
        }

        int gcd = 1; // 최대공약수을 담을 변수

        for(int i=1; i <= small; i++){
            // small 만큼 돌아야하는 이유는 두수중에 small이 더 작기때문에
            // 최대공약수기 때문에 small보다 클수는 없다.
            if(big % i == 0 && small % i == 0) // big과 small이 딱 나눠지는경우가 최대공약수이다.
                gcd = i;
        }
        System.out.println(gcd);
    }
}
