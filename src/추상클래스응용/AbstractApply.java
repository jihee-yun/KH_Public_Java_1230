package 추상클래스응용;

public class AbstractApply {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S23");
        smartPhone.setPower(true);
        smartPhone.call();
        smartPhone.internet();

        Phone phone = new SmartPhone("Common SmartPhone");
        phone.setPower(true);
        phone.call();
        ((SmartPhone)phone).internet(); // 부모는 자식이 만든 속성을 볼 수 없음. 형변환으로 사용은 가능

    }
}
