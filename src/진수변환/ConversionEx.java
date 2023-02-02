package 진수변환;
// 문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
// 입력 : 첫째줄에 8진수
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로 시작
// 314 => 각자리의 수가 0 ~ 7
// 11001100
// 000 001 010 011 100 101 110 111
// 000   1  10  11 100 101 110 111

import java.util.Scanner;

public class ConversionEx {
    public static void main(String[] args) {
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] arr2 = {"", "1", "10", "11", "100", "101", "110", "111"};
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String oct = sc.next();

        for(int i = 0; i < oct.length(); i++) {
            if(oct.length() == 1 && oct.charAt(0) - '0' == 0) {
                System.out.println("0");
                break;
            }
            if(i == 0) {
                System.out.print(arr2[oct.charAt(0) - '0']);
            } else {
                System.out.print(arr[oct.charAt(i) - '0']);
            }
        }
    }
}
