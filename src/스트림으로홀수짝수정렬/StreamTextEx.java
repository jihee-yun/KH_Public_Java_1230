package 스트림으로홀수짝수정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 7개의 정수를 입력 받아 홀수 짝수 나누어 출력하기
// 스트림을 이용해서 문제 풀기
public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
//        int[] arr2 = arr;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.stream(arr).filter(n->n % 2 == 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        Arrays.stream(arr).filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < 7; i++) list.add(sc.nextInt());
//        System.out.print("홀수 : ");
//        list.stream().filter(n->n % 2 != 0).forEach(s->System.out.print(s + " "));
//        System.out.println();
//        System.out.print("짝수 : ");
//        list.stream().filter(n->n % 2 == 0).forEach(s->System.out.print(s + " "));
    }
}