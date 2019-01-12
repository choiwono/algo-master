public class algo06 {
    public static void main(String[] args) {
        int n = 4;

        int num = 1;

        for(int j=0; j<n; j++) {
            for(int i=0; i < n; i++) { // 4 * 4 가 된다.
                System.out.printf("%4d", j*(n) + i + 1);
                //num++;
            }
            System.out.println();
        }
    }
}
