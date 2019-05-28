import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Prorammers42746 {
    public static void main(String[] args) {
        int[] numbers = {3,30,34,5,9};
        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers){
        //String answer = "";
        // comparable 클래스를 알아야 풀 수 있다.
        String[] arr = new String[numbers.length];
        for(int i = 0; i<numbers.length; i++)
            arr[i] = String.valueOf(numbers[i]);
        //comparable 클래스를 통해서 o1+o2 가 큰지 o2+o1이 큰지 알아야됨.
        Arrays.sort(arr,(o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder sb = new StringBuilder();
        if(arr[0].equals("0")) return "0";

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
