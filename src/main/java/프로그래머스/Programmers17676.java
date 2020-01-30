package 프로그래머스;

public class Programmers17676 {
    public static void main(String[] args) {
        /*String[] time = {
            "2016-09-15 20:59:57.421 0.351s",
            "2016-09-15 20:59:58.233 1.181s",
            "2016-09-15 20:59:58.299 0.8s",
            "2016-09-15 20:59:58.688 1.041s",
            "2016-09-15 20:59:59.591 1.412s",
            "2016-09-15 21:00:00.464 1.466s",
            "2016-09-15 21:00:00.741 1.581s",
            "2016-09-15 21:00:00.748 2.31s",
            "2016-09-15 21:00:00.966 0.381s",
            "2016-09-15 21:00:02.066 2.62s"
        };*/
        String[] time = {"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"};
        int answer = solution(time);
        System.out.println(answer);
    }

    public static int solution(String[] lines){
        int answer = 0;
        
        int[] traffic = new int[lines.length];
        double S, T, section;

        for(int i = 0; i < lines.length; i++ ) {
            // 앞에 날짜부분을 모두 제외한다. 시간 부분에 ":, s"를 빈 문자열로 치환한다.
            // 예상 문자열 010004.002 2.0s
            lines[i] = lines[i].substring(11).replace(":", "").replace("s","");

            // 시간을 모두 초로 치환한다. 시간은 3600초, 분 60초, 초는 그대로
            int toSec = (Integer.parseInt(lines[i].substring(0,2)) * 3600 +
                        Integer.parseInt(lines[i].substring(2,4)) * 60) + Integer.parseInt(lines[i].substring(4,6));
            // 초 + 뒷부분 문자열은 모두 더한다..
            lines[i] = "" + toSec + lines[i].substring(6);
            System.out.println(lines[i]);
        }

        for(int i = 0; i<lines.length; i++) {
            // split 메소드에서 정규식에 해당하는 경우는 \\을 붙여줘야 한다. 정상적으로 작동이 안되는 경우에는 \\를 붙이거나 \를 붙여보면 된다. \ 한개가 해당하는 경우도 있다.
            String[] splited = lines[i].split("\\s");
            S = Double.parseDouble(splited[0]);
            T = Double.parseDouble(splited[1]);
            System.out.println("S :" + S + ",T : " + T);

            section = S + 1;
            System.out.println(section);

            for(int j = i; j<lines.length; j++) {

                splited = lines[j].split("\\s");
                S = Double.parseDouble(splited[0]);
                T = Double.parseDouble(splited[1]);

                double temp = S - T + 0.001;
                System.out.println("S - T = "+temp);
                // 걸린시간이 0보다 작을경우..
                if(temp - section < 0) {
                    System.out.println("temp:"+temp+","+"section:"+section);
                    traffic[i]++;
                }
            }

        }
        // 왜 있는 코드?
        for (int i = 0; i < lines.length; i++) {
            if (answer < traffic[i]) {
                answer = traffic[i];
            }
        }
        System.out.println("answer:"+answer);
        return answer;
    }
}