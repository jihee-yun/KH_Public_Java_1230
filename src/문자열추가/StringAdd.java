package 문자열추가;
// 2개의 문자열을 입력 받고, 정수 n값을 입력 받음
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// ulkorea
// 첫번째 문자열의 뒤 부분의 n개의 문자를 추출해 두번째 문자열 앞에 붙여주는 코드 작성
// substring 사용하고, substring 이용해서 문자열 추출할 때 사용되는 인덱스 미리 구해야 함


import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String firstStr = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String secondStr = sc.next();
        System.out.print("정수값 입력 : ");
        int n = sc.nextInt();
        int pos = firstStr.length() - n;
        String sub = firstStr.substring(pos);
        System.out.println(sub + secondStr);



    }
}
