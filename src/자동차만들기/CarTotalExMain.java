package 자동차만들기;

import java.util.Scanner;

public class CarTotalExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distArr = {0, 400, 150, 200, 300};
        System.out.print("이동 지역을 선택하세요 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int dist = sc.nextInt();
        int realDist = distArr[dist];
        System.out.print("이동 승객 수를 입력하세요 : ");
        int number = sc.nextInt();
        System.out.print("이동 차량을 선택하세요 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가 기능을 선택하세요 [1]ON [2]OFF : ");
        int sel = sc.nextInt();
//        setTrunk = (sel == 1) ? true : false;
         if(carSel == 1) { SportsCar sportsCar = new SportsCar("Ferrari");
             sportsCar.totalTime(realDist);
             sportsCar.totalFuel(realDist);
             sportsCar.totalCost(realDist);

         } else if(carSel == 2) { Sedan sedan = new Sedan("GV80");
             sedan.totalTime(realDist);
             sedan.totalFuel(realDist);
             sedan.totalCost(realDist);
//             sedan.setTrunk();

         } else { Bus bus = new Bus("관광버스");
             bus.totalTime(realDist);
             bus.totalFuel(realDist);
             bus.totalCost(realDist);
         }

        }

}




