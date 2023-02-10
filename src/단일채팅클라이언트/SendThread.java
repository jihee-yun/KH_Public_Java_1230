package 단일채팅클라이언트;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
    private final Socket socket;
    private Scanner sc = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());
            String sndString;
            while(true) {
                sndString = sc.nextLine();
                sendWriter.writeUTF(sndString);
                sendWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
