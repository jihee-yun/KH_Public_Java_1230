package 구간합구하기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SectionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            for(int j = 0; j < arr2.length; j++) {
                int i1 = sc.nextInt();
                int j1 = sc.nextInt();
//                int sum = arr[i1 -1] + arr[j1 -1];
//                arr2[j] = sum;
//                int[] arr3 = new int[j1 - i1 + 1];
//                for(int k = i1 - 1; k < j1 - 1; k++) {
//                    arr3[k] += arr[k];
//                }
//                for(int e : arr3) System.out.println(e);
            }
            for(int e : arr2) System.out.println(e);
        }
    }

