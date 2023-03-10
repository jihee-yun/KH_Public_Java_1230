package 클래스정렬연습문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

// 첫번째 줄에 학생의 수 N 입력
// 두번째 줄부터 학생의 이름과 성적을 공백 기준으로 입력
// 2
// 안유진 80 정국 98 유나 88
// 출력 조건 : 모든 학생의 이름을 성적이 낮은 순서대로 출력하기
public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> ts = new TreeSet<>(new SortScore());
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) { // 학생의 수만큼 이름과 성적을 입력 받음
            ts.add(new Student(sc.next(), sc.nextInt()));
        }
        for(Student e: ts) System.out.print(e.name + " ");
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class SortScore implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name); // 성적이 같은 경우 이름을 사전순 정렬
        }
        return o1.score - o2.score;
    }
}