package 다중채팅서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiChatThread extends Thread {
    Socket socket;
    List<Socket> sockets = new ArrayList<>(); // 클라이언트의 요청에 따라 만들어지는 socket 을 관리하기 위한 리스트
    public MultiChatThread(Socket socket) { // accept()의 반환값으로 만들어진 소켓의 식별자를 매개변수로 받음
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            String str;
            // 소켓으로부터 입력을 받음 (byte 단위)
            InputStream is = socket.getInputStream();
            // 문자 변환 보조 스트림 (byte 입력을 문자로 변환), 한글 입출력 등을 사용할 때 한글 깨짐을 방지
            InputStreamReader isr = new InputStreamReader(is);
            // 버퍼를 사용해 입/출력 성능을 개선함
            BufferedReader reader = new BufferedReader(isr);
            if((str = reader.readLine()) != null) {
                System.out.println(str); // 소켓을 통해 입력 받은 내용을 출력
                for(int i = 0; i < sockets.size(); i++) { // list 에 포함된 socket 개수만큼 순회
                    OutputStream out = sockets.get(i).getOutputStream(); // 쓰기를 위한 소켓 스트림 얻기
                    // 실제 텍스트 출력
                    PrintWriter writer = new PrintWriter(out, true); // autoFlush 옵션(자동으로 버퍼비우기)
                    writer.println(str);
                }
            }
        } catch (IOException e) {}
    }
}
