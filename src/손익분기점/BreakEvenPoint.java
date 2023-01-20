package 손익분기점;
// 손익분기점이란? 총 수입이 총 비용보다 많아져 이익이 발생하는 지점
// A(고정비용), B(가변비용), C(판매가격)
// 이익이 나는 지점의 생산 댓수 출력하기
// 손익 분기점이 존재하지 않으면 -1 출력

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int n;
//        int totalCost = a + (b * n);
//        int totalImport = c * n;
//        if(totalCost < totalImport) System.out.println(n);
//        else System.out.println("-1");

        // 반복문을 사용한 경우
        int cnt = 0;
        int fixCost = sc.nextInt();
        int valCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if(valCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
//        while (true) {
//            if(fixCost + (valCost * cnt) < sellPrice * cnt) break;
//            cnt++;
//        while (true) {
//            if(cnt > fixCost / (sellPrice - valCost)) break;
//            cnt++;
//        }
//        System.out.println(cnt);

        // 간단식
        System.out.println((fixCost / (sellPrice - valCost) + 1));
    }

}
