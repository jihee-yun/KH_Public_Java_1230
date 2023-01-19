package 자동차만들기;

public class Sedan extends Car {
    boolean isTrunk;

    public Sedan(String name) {
        this.name = name;
        maxSpeed = 200;
        fuel = 10;
        tankSize = 30;
        seat = 4;
    }
    public void setTrunk(boolean trunk) {
        this.isTrunk = trunk;
        if(trunk) {
            seat += 1;
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
