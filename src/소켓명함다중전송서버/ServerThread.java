package 소켓명함다중전송서버;

import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread {

    Socket socket;
    static List<Socket> sockets = new ArrayList<>();
    static List<NameCardInfo> list = new ArrayList<>();

    public ServerThread(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            while(true) {
                String str;
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isr);
                if((str = reader.readLine()) != null) {
                    for(int i = 0; i < sockets.size(); i++) {
                        OutputStream os = sockets.get(i).getOutputStream();
                        ObjectOutputStream oos = new ObjectOutputStream(os);
                        oos.writeObject(writeNameCard());
                        oos.flush();
                        oos.close();
                    }
                }
            }
        } catch (IOException e) {}
    }
    static List<NameCardInfo> writeNameCard() {
        list.add(new NameCardInfo("제니", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("지수", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("리사", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("로제", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("다니엘", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("민지", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("해린", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("혜인", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("하니", "010-1234-5678", "person1@gmail.com", "경기도"));
        list.add(new NameCardInfo("아이유", "010-1234-5678", "person1@gmail.com", "경기도"));
        return list;
    }
}
