package 기타;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phone_book = {"119","97674223","1195524421"};
        solution(phone_book);
    }

    public static boolean solution(String[] phone_book){
        // 정렬 문제...!!
        Arrays.sort(phone_book);
        Queue<String> phoneQue = new LinkedList<>();
        for(String s : phone_book)
            phoneQue.offer(s);

        String temp = phoneQue.poll();
        while(true){
            if(phoneQue.peek().startsWith(temp)){
                return false;
            } else {
                temp = phoneQue.poll();
            }
            if(phoneQue.isEmpty()){
                return true;
            }
        }
    }
}
