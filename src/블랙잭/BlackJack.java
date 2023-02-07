package 블랙잭;
// 5 21 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 3장의 카드를 더한 값이 주어진 값에 가장 가깝도록 찾기(주어진 값을 넘어갈 수 없다)
//5 6 7 8 9
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드 합
        int rst = 0; // 결과 값
        System.out.print("카드 숫자 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] cardNum = new int[cnt];
        for(int i = 0; i < cardNum.length; i++) {
            cardNum[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = i + 1; j < cnt; j++) {
                for(int k = j + 1; k < cnt; k++) {
                    sum = cardNum[i] + cardNum[j] + cardNum[k];
                    if(sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
//        Integer[] arr = Arrays.stream(cardNum).boxed().toArray(Integer[]::new);
//        Arrays.sort(arr, Collections.reverseOrder());
//        for(int i = 0; i < cardNum.length; i++) {
//            if(arr[i] <= m ) sum += arr[i];
//            cnt++;
//            if(cnt == 3) break;
//        }
//        System.out.println(sum);
    }
}
