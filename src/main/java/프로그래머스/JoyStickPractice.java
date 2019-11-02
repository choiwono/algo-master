package 프로그래머스;

public class JoyStickPractice {
    public static void main(String[] args) {
        String name = "JEROEN";
        JoyStickPractice joyStick = new JoyStickPractice();
        int answer = joyStick.solution(name);
        System.out.println(answer);
    }
    // 조이스틱 문제.. "AAAAAA" 에서 최소한으로 움직이는 경우의수

    public int solution(String name){
        int answer = 0;
        // NAME의 길이만큼 문자열을 만들자..
        String make = "";

        for(int i=0; i<name.length(); i++){
            make += "A";
        }
        int now = 0;
        // make와 name 값이 다를 경우 계속 반복..
        while (make != name){
            int i = 0;
            int temp1 = 0;
            int temp2 = 0;
            int j, k;

            // 오른쪽으로 찾는다
            for (k=0; k < name.length(); k++){
                int idx = (now + k) % name.length();
                if(make.charAt(idx) != name.charAt(idx)){
                    if((idx - now) < 0){
                        temp1 = name.length() - now + idx;
                        break;
                    } else {
                        temp1 = idx - now;
                        break;
                    }
                }
            }

            // 왼쪽으로 찾는다..
            for(j = 0; j< name.length(); j++){
                int idx = (now - j + name.length()) % name.length();
                if(make.charAt(idx) != name.charAt(idx)){
                    if((now - idx) < 0){
                        temp2 += name.length() - idx + now;
                        break;
                    } else {
                        temp2 += now - idx;
                        break;
                    }
                }
            }

            // 왼쪽이 이득인지 오른쪽이 이득인지 최소값을 찾는다.
            if(temp1 <= temp2){
                i = (now + k) % name.length();
                answer += temp1;
            } else {
                i = (now - j + name.length()) % name.length();
                answer += temp2;
            }

            // 상하로 움직이는 값을 더한다
            now = i;
            if(name.charAt(i) - 'A' < 13){
                answer += name.indexOf(i) - 'A';
            } else {
                answer += 'Z' - name.charAt(i) + 1;
            }
        }

        return answer;
    }
}
