package 홀수짝수나누어담기;
// 7개의 정수를 입력받아 홀수와 짝수를 각각의 배열에 나누어 담기
// 첫번째 메소드는 7개의 정수를 입력 받는 메소드
// 두번째 메소드는 홀수와 짝수를 나누어 담는 메소드
// 세번째 메소드는 결과를 출력하는 메소드

// inputArray[7]
// oddArray[7]
// evenArray[7]
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/// 999를 입력하면 그만 받음
public class EvenOddArray {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void InputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int value = 0;
        while (true) {
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value);
        }
    }

    void separateValue() {
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }

    void displayValue() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }
}