package 자동차만들기;

public class Car {
    String name;
    int maxSpeed;
    int fuel;
    int tankSize;
    int seat;

    public Car() {
        this.maxSpeed = 120;
        this.fuel = 10;
        this.tankSize = 30;
        this.seat = 4;
    }

    public void viewInfo() {
        System.out.println("======= 차량 정보 =======");
        System.out.println("이름 : " + name);
        System.out.println("최고속도 : " + maxSpeed);
        System.out.println("연비 : " + fuel);
        System.out.println("연료탱크 : " + tankSize);
        System.out.println("좌석 수 : " + seat);
    }
}
