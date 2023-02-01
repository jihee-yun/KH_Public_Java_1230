package 쓰레드예제6;
// 세마포어 : 여러개의 프로세서가 공통의 메모리 영역(Critical section)에 접근하는 것을 방지하는 것
// 뮤텍스 : 여러개의 쓰레드가 공통의 메모리 영역에 접근하는 것을 방지하는 것(자바에서는 Synchronized)
public class WorkObject {
    // methodA()는 동기화 처리가 되어서 동시 접근 허용을 하지 않음
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행...");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 전환
        try {
            wait(); // ThreadA를 대기 상태로
        } catch (InterruptedException e) {}
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행...");
        notify();
        try {
            wait(); // ThreadB를 대기 상태로
        } catch (InterruptedException e) {}

    }
}


class ThreadA extends Thread {
    private WorkObject workObject;
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private WorkObject workObject;
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}
