package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleGetEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 기본값 입력
        int tmp; // 키보드의 값을 입력 받기 위한 변수
        while(true) {
            tmp = sc.nextInt();
            if(tmp == 0) break;
            list.add(tmp);
        }
        for(Integer e: list) {
            if(e % n == 0) System.out.println(e + " is a multiple of " + n + ".");
            else System.out.println(e + " is NOT a multiple of " + n + ".");
        }
    }
}
