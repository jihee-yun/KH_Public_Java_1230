package 쓰레드예제7;
// 쓰레드의 안정적인 종료(Stop 플래그, interrupt())

import java.util.Scanner;

public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        Scanner sc = new Scanner(System.in);
//        runThread.start();
//        Thread.sleep(5000);
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(5000);
        interruptThread.interrupt();


    }
}
