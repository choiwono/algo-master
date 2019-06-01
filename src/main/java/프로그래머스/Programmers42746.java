package 프로그래머스;

import java.util.*;

public class Programmers42746 {
    public static void main(String[] args) {
        int[] numbers = {3,30,34,5,9};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers){
        // 330 303
        String answer = "";
        String answer2 = "";
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++)
            str[i] = Integer.toString(numbers[i]);

        for(int i=0; i<str.length; i++){
            for(int j=i+1; j<str.length; j++){
                answer = str[i] += str[j];
                //System.out.println(answer);
            }
        }
        Arrays.sort(str,Comparator.naturalOrder());

        for(int i=str.length-1; i>-1; i--){
            for(int j=i-1; j>-1; j--){
                if(i==j) break;
                answer2 = str[i] += str[j];
                answer2 = "";
                System.out.println(answer2);
            }
        }
        return answer;
        /*
        //Arrays.sort(str,(o1, o2) -> (o2+o1).compareTo(o1+o2));
        Arrays.sort(str,Comparator.reverseOrder());
        // 내부적으로 정렬
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++)
            sb.append(str[i]);

        return sb.toString();*/

    }
    /*public static String solution(int[] numbers){
        // compareTo를 통해서 더큰 문자열을 서로 비교가 가능하다.
        // 내부에 숫자를 비교해서 더큰 숫자를 찾아야 하면 저렇게 구현하자
        String answer = "";
        String[] arr = new String[numbers.length];

        for(int i=0; i<numbers.length; i++)
            arr[i] = Integer.toString(numbers[i]);

        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        // Arrays.sort(arr, new Comparator<String>(){
        //            @Override
        //            public int compare(String o1, String o2) {
        //                if(Integer.parseInt(o1+o2) > Integer.parseInt(o2+o1)){
        //                    return -1;
        //                } else {
        //                    return 1;
        //                }
        //            }
        //        });

        if(Integer.parseInt(arr[0]) == 0)
            return "0";

        StringBuffer sb = new StringBuffer();

        for(String i : arr)
            sb.append(i);

        return sb.toString();
    }*/
}
