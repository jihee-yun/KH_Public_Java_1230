package 입출력스트림연습1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

//
public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/입출력스트림연습1/grade.txt");
        TreeSet<Student> treeSet = new TreeSet<>(new Grade());
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            treeSet.add(new Student(arr[0], Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),Integer.parseInt(arr[3])));
        }
        for(Student e : treeSet) {
            System.out.print(e.name + ":");
            System.out.print(e.getTotal() + " ");
        }
        inputStream.close();
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    int getTotal() {
        return kor + eng + mat;
    }
}


class Grade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getTotal() < o2.getTotal()) return 1;
        else if(o1.getTotal() == o2.getTotal()) {
            return o1.name.compareTo(o2.name);
        }
        else return -1;
    }
}

