package 다중채팅클라이언트;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiSnd extends Thread {
    private Socket socket = null;
    private String name = null;
    private Scanner sc = null;

    public MultiSnd(Socket socket, String name) {
        sc = new Scanner(System.in);
        this.socket = socket;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            while (true) {
                OutputStream os = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(os, true); // autoFlush 이므로 별도의 flush 동작 필요 없음
                writer.println(name + " : " + sc.nextLine());
            }
        }catch (IOException e) {}
    }
}
