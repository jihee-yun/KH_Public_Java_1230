package 상근날드;

import java.util.Scanner;

// 상근날드에 3가지 햄버거와 2가지 음료를 판매
// 3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고, 음료 중 가장 싼 메뉴의 가격을 선택
// 세트 메뉴는 50원 할인
// 1000 1500 2000 500 1000 = 1500원에서 세트 메뉴 할인 = 1450
public class SetMenu {
    public static void main(String[] args) {
        int[] price = new int[5];
        int setMenu = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }

        int min1 = price[0];
        int min2 = price[3];

        for(int i = 0; i < price.length; i++) {

            if((i < 3) && (min1 > price[i])) min1 = price[i];
            if((i > 2) && (min1 > price[i])) min2 = price[i];
            setMenu = min1 + min2;
        }
        System.out.println(setMenu - 50);

    }
}
