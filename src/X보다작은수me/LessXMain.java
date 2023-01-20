package X보다작은수me;
// 첫째쭐에 N과 X가 주어짐
// 둘째줄에 수열 A를 이루는 정수 N개가 주어진다
// 주어지는 정수는 모두 1보다 크거나 같고, 10000보다 작거나 같은 정수이다.
// 10 5 => 배열의 갯수와 찾을 수를 연속해서 입력
// 1 10 4 9 2 3 8 5 7 6
// 결과 값은 : 1 4 2 3

import java.util.Scanner;

public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x;
        x = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < x) System.out.println(arr[i] + " ");
        }
    }
}
