package 표준입출력3;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        byte a = sc.nextByte(); // 키보드로 입력 받은 결과 byte형으로 반환
        short b =sc.nextShort(); // 키보드로 입력 받은 결과 short형으로 반환
        int c =sc.nextInt(); //
        long d = sc.nextLong(); //
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출해 반환

        String s1 = sc.next(); // 문자열을 공백 기준으로 입력 받음
        String s2 = sc.nextLine(); // 공백 상관없이 줄바꿈까지 입력 받음

    }
}
