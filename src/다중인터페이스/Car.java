package 다중인터페이스;

public class Car {
    protected int speed; // 같은 패키지와 부모 자식 간 접근 가능
    protected String color;
    protected String year;
    public Car() {
        this.speed = 150;
        this.color = "white";
        this.year = "2022";
    }
}
