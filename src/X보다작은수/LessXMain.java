package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 주어진 숫자
//        int[] arr = new int[n];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt(); // 주어진 n만큼 수를 입력 받음
//            if(arr[i] < x) System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            if(arr.get(i) < x) System.out.print(arr.get(i) + " ");
        }
//        System.out.println();
    }
}
