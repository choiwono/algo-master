import java.util.*;

public class Codility03 {
    static int soultion(String[][] arr){
        int result = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j].equals("O")){
                    if(arr[i-1][j-1].equals("X") || arr[i-1][j+1].equals("X")){
                        result += 1;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String[][] square = new String[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                square[i][j] += ".";
            }
        }
        square[5][3] = "O";
        square[4][2] = "X";
        square[4][4] = "X";
        square[3][1] = "X";
        square[2][4] = "X";
        square[0][2] = "X";
        soultion(square);
    }
}
