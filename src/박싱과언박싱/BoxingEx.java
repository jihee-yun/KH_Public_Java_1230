package 박싱과언박싱;
// 프로그램의 동작에 있어 기본타입의 데이터를 객체로 취급해야하는 경우가 있음 (일반호 프로그램 관련)
// Wrapper 클래스는 8개의 기본타입을 객체 타입으로 포장함
// Boxing : 기본 타입을 '자동으로' Wrapper 클래스 타입으로 변환
// UnBoxing : Wrapper 클래스 타입을 기본 타입으로 변환
public class BoxingEx {
    public static void main(String[] args) {
        //Integer num = new Integer(17); // 기본적인 정수형에 대한 Wrapper 클래스 타입
        Integer num = 17; // 자바 1.5 이후 변경된 사항
        //int n = num.intValue(); // 언박싱
        int n = num; // 자바 1.5 이후 변경된 사항

        //Character ch = 'x'; //
        Character ch = new Character('x'); // 정석
    }
}
