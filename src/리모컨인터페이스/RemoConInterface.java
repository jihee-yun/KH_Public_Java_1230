package 리모컨인터페이스;

import java.util.Scanner;

public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택하세요 [1]TV [2]Audio : ");
        int sel = sc.nextInt();
        RemoteControl remoCon;
        if(sel == 1) {
            remoCon = new Television();
            remoCon.turnOn();
            remoCon.setVolume(20);
            remoCon.getInfo();
            remoCon.setMute(true);
            RemoteControl.changeBattery();
        } else {
            remoCon = new Audio();
            remoCon.turnOn();
            remoCon.setVolume(120);
            remoCon.setMute(true);
            remoCon.getInfo();
        }
        RemoteControl rc = new RemoteControl() { // 한번 쓰고 사라지는 익명의 객체..?
            int volume;
            @Override
            public void turnOn() {
                System.out.println("플레이 스테이션5를 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("플레이 스테이션5를 끕니다.");
            }
            @Override
            public void setVolume(int volume) {
                if(volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 플레이 스테이션5 볼륨 : " + this.volume);
            }
            @Override
            public void getInfo() {
                System.out.println("플레이 스테이션5 입니다.");
                System.out.println("현재 볼륨은 " + volume + " 입니다.");
            }
        };
        rc.turnOn();
        rc.setVolume(100);
        rc.getInfo();
    }
}

