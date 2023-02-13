package 소켓명함다중전송서버;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름, 전화번호, 회사명, 이메일 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
// 연결된 클라이언트의 개수에 상관없이 모든 클라이언트에게 전송하기
public class MultiSerialEx2 {
    static List<NameCardInfo> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 9465;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[연결 기다림]");
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + " 연결]");
            System.out.print("명함을 전송하시겠습니까? (Yes/No) : ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Yes")) {
                Thread nameTh = new NameServer(socket);
                nameTh.start();
//        int port = 1591;
//        try {
//            ServerSocket serverSocket = new ServerSocket(port);
//            while(true) {
//                Socket socket = serverSocket.accept();
//                Thread serverTh = new ServerThread(socket);
//                serverTh.start();
//            }
//        } catch (IOException e) {}
            }
        }
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

class NameServer extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;

    public NameServer(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(MultiSerialEx2.writeNameCard()); // 직렬화를 위해 객체를 write
                oos.flush();
                oos.close();
                System.out.print(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
                os.close();
            }
        } catch (IOException e) {}
    }
}

