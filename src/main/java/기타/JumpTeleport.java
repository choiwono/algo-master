package 기타;

public class JumpTeleport {
    public static void main(String[] args) {
        solution(5000);
    }
    public static int solution(int N){
        String n = Integer.toBinaryString(N);
        String[] st = n.split("");
        int cnt = 0;
        for(int i=0; i<st.length; i++){
            if(st[i].equals("1")){
                cnt++;
            }
        }
        return cnt;
    }
    /*public int solution(){

    }*/
}
