package 쓰레드예제7;
// Interrupt 를 통해 종료하는 방법
public class InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Thread 실행 중.......");
                Thread.sleep(1); // sleep 추가 되어 있음
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupt가 발생해서 쓰레드가 종료됩니다");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
