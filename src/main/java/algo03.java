public class algo03 {
    public static void main(String[] args) {
        int num = 17;
        boolean primeNumber = true;
        // 소수는 1, 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가아님.

        for(int i = 2; i <= num/2; i++) {
            // 1을 제외하니까 2부터 시작!!,
            // 당연히 어떤값이든 간에 num/2 보다 수가 클리가 없음
            if(num % i == 0) {
                // 1을 제외한 수로 나눠지는 경우 소수가 아니다!!
                primeNumber = false;
            }
        }

        if(primeNumber) {
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }
}
