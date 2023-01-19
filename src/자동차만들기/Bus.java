package 자동차만들기;

public class Bus extends Car{
    boolean isSideTank;

    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuel = 5;
        tankSize = 100;
        seat = 20;
    }

    public void setSideTank(boolean isSideTank) {
        this.isSideTank = isSideTank;
        if(isSideTank) {
            tankSize += 30;
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

