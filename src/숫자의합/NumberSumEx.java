package 숫자의합;
// 다시 풀어보기
import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있다. 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 7000000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 0000 => 종료 조건
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String number = sc.next();
        int[] arr = new int[number.length()];
        for(int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i);
            sum += arr[i];
            System.out.print(sum);
        }
    }
}

