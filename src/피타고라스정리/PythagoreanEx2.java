package 피타고라스정리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PythagoreanEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while (true) {
            List<Integer> arr = new ArrayList<>();
            arr.add(a = sc.nextInt());
            arr.add(b = sc.nextInt());
            arr.add(c = sc.nextInt());

            for(int e : arr) {
                if (a == 0 && b == 0 && c == 0)
                    break;

                if (a * a + b * b == c * c) {
                    System.out.println("right");
                } else if (a * a + c * c == b * b) {
                    System.out.println("right");
                } else if (b * b + c * c == a * a) {
                    System.out.println("right");
                } else
                    System.out.println("wrong");
            }
        }
    }
}

