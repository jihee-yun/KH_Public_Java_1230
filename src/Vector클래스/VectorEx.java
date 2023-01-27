package Vector클래스;

import java.util.List;
import java.util.Vector;

// ArrayList : 동적 배열(개수를 정할 필요 X, 값이 추가될 때 사이즈가 커짐), 검색은 매우 빠름
// 삽입과 삭제는 매우 느림 O(n), 동기화를 지원하지 않는다(멀티쓰레드 환경을 지원하지 않음), 물리적으로 연속된 공간
// Vector : 동적 배열, 물리적으로 연속된 공간, 내부적으로 ArrayList 와 구조가 동일, 동기화 지원하나 느림
// LikedList : 물리적으로 연속된 공간 X, 양방향 링크드 리스트, 검색은 느리나 삽입과 삭제는 빠름
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> vector = new Vector<>();
        vector.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-4567", "변호사"));
        vector.add(new NameCard("동그라미", "ddd@gmail.com", "010-1234-5678", "무직"));
        vector.add(new NameCard("이준호", "ljh@gmail.com", "010-1234-5678", "회사원"));
        vector.add(new NameCard("최수연", "csy@gmail.com", "010-1234-5678", "변호사"));

        for(NameCard e: vector) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }

}