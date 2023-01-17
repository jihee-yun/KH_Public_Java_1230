package 평균은넘겠지;
// [문제]
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다
// 5 => 총 테스트 케이스
// 5 50 50 70 80 100 => 각 테스트에 대한 학생 수, 그리고 각 학생의 점수 ->40.000%
// 7 100 95 90 60 70 60 50 -> 57.143%
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91

import java.util.Scanner;

public class AboveAver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 테스트 케이스 입력 받기
        double[] rst = new double[testCnt];
        for(int i = 0; i < rst.length; i++) {
            rst[i] = overRate();
        }
        for(double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }

    }
    // 각 케이스에 대한 학생수와 그리고 각각의 성적을 입력 받음
    // 입력 받은 성적에 대한 평균 구하기 (먼저 총점 구하고 학생 수로 나누기)
    // 평균을 넘는 학생 수 구하기 (소수점 이하 3자리 변환해서 반환)
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 각 케이스에 대한 학생 수 입력 받기
        int total = 0; // 총점을 구하기 위한 변수
        int overCnt = 0; // 평균이 넘는 학생의 수
        int[] score = new int[cnt];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt(); // 학생 수만큼 성적 입력 받기
            total += score[i]; // 성적 총점 구하기, total = total + score[i];
        }
        double aver = (double)total / cnt;
        for(int e: score) { // e 값은 학생들의 개별 점수
            if(e > aver) overCnt++; // 평균을 넘는 학생 수 구하기
        }
        return (double)overCnt / cnt * 100; // 백분율로 변경
    }
}
