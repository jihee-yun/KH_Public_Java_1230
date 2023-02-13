package 소켓명함다중전송클라이언트;

import 쓰레드예제1.ThreadEx1;

import java.net.Socket;

public class MultiRcv2 extends Thread {
    Socket socket;

    public MultiRcv2(Socket socket) {
        this.socket = socket;
    }


}
