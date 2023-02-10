package 명함전송서버;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 명함 정보를 담을 클래스 생성
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. NameCard Thread 생성해 연결 요청이 오는 클라이언트에 명함 전송하기
// 4. 클라이언트는 서버에 전송한 명함 정보를 출력하기
public class NameCardServer {
    static List<NameCardInfo> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int port = 9465;
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            System.out.println("[연결 기다림]");
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + " 연결]");
            System.out.print("명함을 전송하시겠습니까? (Yes/No) : ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Yes")) {
                OutputStream sendNameCard = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(sendNameCard);
                oos.writeObject(writeNameCard());
                oos.flush();
                oos.close();
                sendNameCard.close();
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

