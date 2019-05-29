package 기타;

import java.util.Scanner;

public class NextPermutation {
    // 브루투포스, 다음순열 구하기
    // 문제
    // 1부터 N까지 이루어진 순열이 있다. 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 만들자.

    // 현재 입력한 숫자 N = 5 일 경우, 12345를 입력하면 12345 다음에 나오는 순열이 출력된다
    // 그 순열이 마지막 순열이었을 경우는 -1을 출력한다

    // 사전순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순이다.
    // N=3인 경우에는 사전순으로 순열을 나열하면 다음과 같다.
    // 1,2,3 오름차순이 먼저 나오고, 그뒤에 내림차순으로 순열이 나온다.
    // EX) 1,2,3
    //     1,3,2
    //     2,1,3
    //     2,3,1
    //     3,1,2
    //     3,2,1
    // 순열을 사전순으로 나열한다는 것은

    // A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
    // j >= i 면서 A[j] > A[i-1]를 만족하는 가장 큰 j를 찾는다.
    // A[i-1]과 A[j]를 swap한다
    // A[i]부터 순열을 뒤집는다

    public static boolean nextPermutation(int[ ] a) {
        int i = a.length-1;
        while(i > 0 && a[i-1] >= a[i]) {
            // i는 부터 N까지 이루어졌기 때문에 0보다 커야한다
            // 순열 입력이 1,2,3,4,5 가 입력됐을 경우 점진적으로 순열을 내림차순에서 오름차순으로 바꾼다.
            // ex) 5가 입력이 됐을경우
            // i = 4, i는 0보다는 무조건 커야함 1부터 N까지 였기때문에
            // a[3] >= a[4] 값을 비교해서 a[3]이 더 크면 i는 반복문을 돌때마다 -1을 한다.

            i -= 1;
        }

        if( i <= 0) {
            // i가 0보다 작거나 같으면 가장 마지막 오름차순 순열이다.
            // i가 0보다 작거나 같을경우 배열정렬은 이미 가장 큰 수가 맨 앞에 있게 된다.
            // ex) 1,2,3,4,5 -> 5,4,3,2,1
            return false;
        }

        int j = a.length - 1;
        // 배열은 0부터 시작하니까 - 1
        // ex) a[4] <= a[3] 더 클 경우 j를 -1을 한다.
        while(a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1]; // temp에 a[3]을 넣는다.
        a[i-1] = a[j]; // a[3]에는 a[3] 값을 넣는다.
        a[j] = temp; // a[3]에 처음 a[i-1] 즉 a[3]값을 넣는다.

        j = a.length-1;
        while(i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        if(nextPermutation(a)) {
            for(int i=0; i<n; i++) {
                System.out.println(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }
}
//c++유저라면 next_permutation으로 다음 순열찾는건 쉬운데 java 유저라면
//막상 지원되지 않는 api와 순열의 경우의 수에 당황하기 쉽다.
//https://soooprmx.com/archives/5523 에서 설명한 사전식 순열 생성방식을 참고하여 문제를 풀었다.
//순서는 다음과 같다. (위 아카이브 글 참고)
//수 배열의 가장 오른쪽에서부터 A[i] < A[i+1]인 가장 큰 인덱스 i를 찾는다. 만약 이를 찾을 수 없다면 탐색을 종료한다.
//k이후 a[k]보다 큰 값을 가진 가장 먼 인덱스를 찾는다. (a[k] < a[l])
//k와 l위치의 값을 교환한다.
//그런다음 k+1 에서 마지막 인덱스 사이를 역순으로 만든다.
//이 역순으로 만드는 부분은 swap함수를 따로 구현하여 풀면 된다.
//이전 순열을 찾는 것은 단순히 대소비교를 뒤집어주면 해결된다.
