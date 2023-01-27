package 배수찾기;
// 첫번째는 배수에 대한 기본값 입력 (주어진 값)
// 연속으로 값을 입력 받기 (Arraylist 입력 받은 값을 저장)
// 0이 들어오면 종료
// 입력 받기를 종료 한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
// 예를 들어 주어진 값이 3이면...
// 99 is a multiple of 3.
// 7 is a NOT multiple of 3.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleGetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("기본값 입력 : ");
        int num = sc.nextInt(); // 주어진 기본값 입력
        List<Integer> number = new ArrayList<>();
        number.add(sc.nextInt());
        for(int i = 0; i < number.size(); i++) {
            if(number.get(i) == 0) break;
            if(number.get(i) % num == 0) {
                System.out.println(number.get(i) + " is a multiple of 3.");
            }
            else if(number.get(i) % num != 0) {
                System.out.println(number.get(i) + " is a NOT multiple of 3.");
            }
        }
    }
}
