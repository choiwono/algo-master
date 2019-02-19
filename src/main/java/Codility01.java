public class Codility01 {
    static int solution(int N) {
        // write your code in Java SE 8
        String a = Integer.toBinaryString(N);
        String[] arr = a.split("1");
        int x = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].length() > arr[j].length()){
                    x = arr[i].length();
                } else if(arr[i].length() < arr[j].length()){
                    x = arr[j].length();
                }
            }
        }
        if(arr.length == 2){
            x=0;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(solution(1073741825));
    }
}
