package 다중채팅클라이언트;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.10.245", 8900);
            System.out.println("서버 접속 성공");
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 설정하세요 : ");
            Thread sndTh = new MultiSnd(socket, sc.nextLine()); // 소켓식별자, 이름을 넣어주기
            Thread rcvTh = new MultiRcv(socket); // 소켓식별자를 생성자에 대입
            sndTh.start();
            rcvTh.start();
        } catch (IOException e) {
            System.out.println("서버 접속 실패!!!");
        }
    }
}
