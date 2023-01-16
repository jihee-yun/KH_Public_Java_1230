package 평균은넘겠지;
// [문제]
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다
// 5 => 총 테스트 케이스
// 5 50 50 70 80 100 => 각 테스트에 대한 학생 수, 그리고 각 학생의 점수
// 7 100 95 90 60 70 60 50
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91

import java.util.Scanner;

// 40.000%
// 57.143%
// 66.667%
// 55.556%
public class AboveAver {
    void aver() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        int[] student = new int[n];
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < student.length; i++) {
            student[i] = sc.nextInt();
            sum += student[i];
            }
        int aver1 = sum / n;
        for(int j = 0; j < student.length; j++) {
            if(student[j] > aver1) sum2 += student[j];
        }

    }
}

