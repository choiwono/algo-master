package 기타;

public class Numbers12953 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        Numbers12953 numbers = new Numbers12953();
        int answer = numbers.solution(arr);
        System.out.println(answer);
    }

    public int solution(int[] arr){
        int a, b;
        // a * b / 최소공약수 = 최대공배수
        int gcd = gcd(Math.max(arr[0],arr[1]),Math.min(arr[0],arr[1])); // 최대공약수
        int lcm = arr[0] * arr[1] / gcd; // 최소공배수..

        for(int i=2; i<arr.length; i++){
            a = Math.max(lcm,arr[i]);
            b = Math.min(lcm,arr[i]);
            gcd = gcd(a,b);
            lcm = a * b / gcd;
        }
        return lcm;
        // arr 첫번쨰, 두번째로 구한 최소공배수
        // 답은 a * b / 최소공약수..
        // 작은수가 0이 될때까지 나누자!!
    }

    public int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y,x%y);
        // y가 0일 경우 바로 리턴..
        // y가 0이면 최소공배수니까.. y, x%y
    }
}
