package 십진수이진수변환복습;

import java.util.Scanner;

public class DecToBinFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("2진수 : " + val);
        val = BinToDec(val);
        System.out.println("10진수 : " + val);
    }
    //함수의 결과가 이진수 형태로 표시되지만 실제로는 이진수 아님
    static int decToBin(int dec) {
        int bin = 0;
        int tmp = 0; // 계산 결과를 담을 임시 변수
        int pos = 1; // 포지션(자리수)
        while(dec != 0) {
            tmp = dec % 2; // dec 값이 11인 경우 1
            bin = bin + tmp * pos; // 첫번째 값은 1
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;
    }
    static int BinToDec(int bin) {
        int dec = 0, i = 0, tmp = 0;
        while(bin != 0) {
            tmp = bin % 10;
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++);
        }

        return dec;
    }
}
