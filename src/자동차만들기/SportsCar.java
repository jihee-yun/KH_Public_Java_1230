package 자동차만들기;

public class SportsCar extends Car {
    boolean isTurbo;
    double turboON;

    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuel = 8;
        tankSize = 30;
        seat = 2;
    }

    public void setTurbo(boolean turbo, int speed) {
        isTurbo = turbo;
        maxSpeed = speed;
        if (turbo) {
            turboON = maxSpeed * 1.2;
        }
    }

    public void totalTime(int distance) {
        int totalTime;
        totalTime = distance / maxSpeed;
        System.out.println("총 시간 : " + totalTime);
    }

    public void totalFuel(int distance) {
        int totalFuel;
        totalFuel = distance / (fuel * tankSize);
        System.out.println("주유 횟수 : " + totalFuel);
    }

    public void totalCost(int distance) {
        int totalCost;
        totalCost = (distance / (fuel * tankSize)) * tankSize * 2000;
        System.out.println("총 비용 : " + totalCost);

    }
}
