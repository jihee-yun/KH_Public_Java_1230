package KH시험;

import java.util.Scanner;

public class Khtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        if(num > 0) {
            int i = 1;
            while(i <= num) {
                sum += i;
                i++;
            }
            System.out.println("1부터" + num + "까지의 합은 " + sum + "입니다.");
        } else {
            System.out.println("숫자가 1 이상이 아닙니다.");
        }
    }
}
