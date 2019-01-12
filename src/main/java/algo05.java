public class algo05 {
    public static void main(String[] args) {
        int inputNum = 1242;
        int accNum = 0;

        // 1232 => 123 => 12 => 1
        // 2 + 3 + 2 + 1 => 8

        while(inputNum > 0) {
            accNum += inputNum % 10; // 1242 % 10 = 2, 4, 2, 1
            inputNum /= 10; // 124, 12
        }
        System.out.println(accNum);
        // accNum = 2,
    }
}
