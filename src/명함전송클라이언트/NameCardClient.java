package 명함전송클라이언트;

import 명함전송서버.NameCardInfo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 9465);
        System.out.println("[서버 연결 성공]");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCardInfo> list = (List<NameCardInfo>) ois.readObject();
        viewNameCard(list);
    }
    static void viewNameCard(List<NameCardInfo> list) {
        for(NameCardInfo e : list) {
            System.out.println("====== 명함 정보 출력 ======");
            System.out.println("이름 : " + e.getName());
            System.out.println("전화번호 : " + e.getPhoneNumber());
            System.out.println("이메일 : " + e.geteMail());
            System.out.println("주소 : " + e.getAddress());
        }
    }
}
