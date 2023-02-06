package 스트림예제4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 스트림은 자바8 버전에 추가된 문법
// Stream 은 객체 요소를 처리하는 스트림(IntStream, LongStream, DoubleStream)은
// 각각의 기본 타입인 int, long, double 요소를 처리하는 스트림이다
// 자바에서 제공하는 모든 컬렉션의 최고 조상인 Collection 인터페이스에는 stream() 메소드가 정의되어 있다
public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.stream().forEach(System.out::println); // 메소드 참조 문법을 사용할 수 있다
//        list.stream().forEach(s->System.out.print(s + " "));
        IntStream stream = IntStream.rangeClosed(1, 100); // 1 ~ 100까지 합을 구함
        int sum = stream.sum();
        System.out.println(sum);
    }
}
