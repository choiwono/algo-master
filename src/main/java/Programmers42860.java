import java.util.HashMap;

public class Programmers42860 {
    public static void main(String[] args) {
        byte[] a = "A".getBytes();
        String nameStr = "JAN";
        System.out.println(solution(nameStr));
        //System.out.println(a[0]);
    }

    public static int solution(String nameStr){
        int answer = 0;
        StringBuilder str = new StringBuilder();
        byte[] bytes = nameStr.getBytes();
        byte[] a = "A".getBytes();
        // A -> J, A->E, A->R, A->O, A->E, A->N
        // 음.. 어떤게 베스트인가?
        int move = bytes.length-1;
        for(int i=0; i<bytes.length; i++){
            System.out.println(bytes[i]);
            if(bytes[i] < 78 && bytes[i] > 65){
                answer += bytes[i] - 65; // 9
            } else if(bytes[i] > 78){
                answer += 90 - bytes[i]+1;
            } else if(bytes[i] == 78){
                answer += 13;
            } else if(bytes[i] == 65){
                move -= 1; // 1
            }
        }
        return answer+move;
    }
}
