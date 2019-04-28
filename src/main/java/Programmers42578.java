import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Programmers42578 {
    public static int solution(String[][] clothes) {
        // 각 옷 종류별로 가짓수를 세본다.
        // 그러면 각 부위별로 몇가지의 옷을 가지고 있는지 세본다.
        HashMap<String,Integer> map = new HashMap<>();
        int cnt = 1;
        int answer = 1;
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.replace(clothes[i][1],map.get(clothes[i][1])+1);
            } else {
                map.put(clothes[i][1],1);
            }
        }
        for(int v : map.values()){
            answer *= v+1;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "face"},{"blue_sunglasses", "face"},{"green_turban", "face"}};
        System.out.println(solution(clothes));
    }
}
