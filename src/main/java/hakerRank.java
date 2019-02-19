import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class hakerRank {
    // Complete the aVeryBigSum function below.
    static void staircase(int[][] s) {
        int[] visited = new int[3*3];
        for(int i=0; i<9; i++){
            visited[i] = i+1;
        }


        for(int i=0; i<s.length; i++){
            for(int j=0; j<s.length; j++){
                if(i==j) continue;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
