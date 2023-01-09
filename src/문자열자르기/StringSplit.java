package 문자열자르기;
// 시간 입력 : 23:30:59
// 시간 입력 : 11:3:1 => 오전 11시 03분 01초
// 출력은 : 오후 11시 30분 59초

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력  : ");
        String time = sc.next();

        String[] result = time.split(":");

        String hour = "0";
        String min = "0";
        String sec = "0";


        int intHour = Integer.parseInt(result[0]);
        int num = 13;


        if(result[0].length() == 1) { result[0] = hour + result[0]; }
        else if(result[1].length() == 1) { result[1] = min + result[1];}
        else if(result[2].length() == 1) { result[2] = sec + result[2];}
        else

        if(intHour < num) {
            System.out.printf("오전 %s시 %s분 %s초", result[0], result[1], result[2]);
        } else System.out.printf("오후 %s시 %s분 %s초", result[0], result[1], result[2]);

    }
}
