package 스트링버퍼;
import java.lang.*; // 자동으로 컴파일러에 의해서 추가 (기본 패키지)
// StringBuffer : 문자열을 추가하거나 변경할 때 사용되는 자료형 (동기화 처리가 있음)
// StringBuilder : 문자열을 추가하거나 변경할 때 사용되는 자료형 (동기화 처리가 없음)
// String : 문자열을 + 연산자로 추가하면 매번 더할 때마다 새로운 문자열이 생성 (불변성의 법칙)
// append(), delete(), insert(), substring()
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 스캐너와 마찬가지. StingBuffer 객체 생성 필요
        sb.append("hello");
        sb.append(" ");
        sb.append("to Java");
        sb.append(" ");
        sb.append("javascript");
        sb.delete(1, 3); // 1번 인덱스에서 3번 인덱스 미만까지
        sb.insert(0, "test "); // 해당 인덱스에 문자열을 추가
        System.out.println(sb);
        System.out.println(sb.substring(0, 4)); // 시작 인덱스에서 종료 인덱스 미만까지만 문자열 출력
//        String rst = "";
//        rst += "hello";
//        rst += " ";
//        rst += "to Java";
//        System.out.println(rst);
    }
}
