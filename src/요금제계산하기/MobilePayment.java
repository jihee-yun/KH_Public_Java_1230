package 요금제계산하기;
// 영식 요금제 : 30초마다 10원씩 청구 (30초 미만이면 1통, 30초부터 2통)
// 민식 요금제 : 60초마다 15원씩 청구 (60초 미만이면 1통, 60초부터 2통)
// 통화 횟수 : 3 (20회 미만)
// 통화 시간 : 40 70 45
// 둘 중 싼 요금제의 입력을 표시하고 통 요금 계산(영식 요금제 : 총 통화 금액)
// 총 통화금액이 같으면 (영식/민식 요금제 : 총 통화 금액)

import java.util.Scanner;

public class MobilePayment {
    public static void main(String[] args) {
        // 총 통화 횟수 저장을 위한 배열 생성
        int[] call = new int[20];
        int yPayTotal = 0, mPayTotal = 0; // 총 요금을 위한 변수 생성

        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 입력 : ");
        int cnt = sc.nextInt();


        System.out.print("통화 시간 입력 : ");
        for(int i = 0; i < cnt; i++) {
            call[i] = sc.nextInt();
            }
        for(int i = 0; i < cnt; i++) {
            yPayTotal += (call[i] / 30) * 10 + 10; // 통화가 걸리면 무조건 1통 계산된다(+ 10)
            mPayTotal += (call[i] / 60) * 15 + 15; //
        }
        if(yPayTotal > mPayTotal) {
            System.out.println("민식 요금제 : " + mPayTotal);
        }
        else if(yPayTotal < mPayTotal) {
            System.out.println("영식 요금제 : " + yPayTotal);
        } else {
            System.out.println("영식/민식 요금제 : " + yPayTotal);
        }

        }

    }

