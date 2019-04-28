import java.util.Arrays;
import java.util.HashMap;

public class Programmers42577 {
    public static boolean solution(String[] phoneBook){
        //boolean answer = true;
        Arrays.sort(phoneBook);
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0; i<phoneBook.length; i++){
            map.put(i,phoneBook[i]);
        }

        for(int j=1; j<phoneBook.length; j++){
            if(map.get(j).contains(map.get(0))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] participant = {"12","123","1235","567","88"};
        System.out.println(solution(participant));
    }
}
