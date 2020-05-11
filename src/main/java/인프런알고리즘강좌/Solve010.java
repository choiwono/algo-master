package 인프런알고리즘강좌;

public class Solve010 {
    public static void main(String[] args) {
        int[] arr = { 125,15232,79,1325,97 };
        solution(5, arr);
    }

    public static int solution(int x, int[] numbers) {
        int answer = 0;
        int[] arr = new int[numbers.length];
        int max = 0;
        int index = 0;

        for(int i = 0; i<x; i++) {
            arr[i] = sum(numbers[i]);
        }

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            } else if(max == arr[i]) {
                answer = Math.max(numbers[index],numbers[i]);
            }
        }

        return answer;
    }

    public static int sum(int x) {
        int sum = 0;
        String number = Integer.toString(x);
        
        for(int i=0; i<number.length(); i++) {
            sum += Integer.parseInt(number.substring(i,i+1));
        }
        
        return sum;
    }
}