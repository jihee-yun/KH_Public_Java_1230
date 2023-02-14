package 소켓이미지전송서버;
// 전송할 파일 선택
// 전송이 끝나면 완료 표시
// 클라이언트 수에 상관없이 모든 클라이언트에 전송하기
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletionException;

public class ImgSocketServer {
    public static void main(String[] args) throws IOException {
        int port = 1591;
        Scanner sc = new Scanner(System.in);
        System.out.print("전송할 파일을 선택하세요(경로/파일명) : ");
        String path = sc.nextLine();
        System.out.println("파일명 : " + path);
        try {
            ServerSocket serverSocket = new ServerSocket(port); // IP와
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.print("[클라이언트 : " + socket.getRemoteSocketAddress() + " 연결]");
                Thread imgTh = new ImageServer(socket, path);
                imgTh.start();
            }
        } catch (CompletionException e) {
        } catch (IOException e) {}
//        while(true) {
//            System.out.println("[연결 기다림]");
//            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
//            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + " 연결]");
//            System.out.print("사진을 전송하시겠습니까? (Yes/No) : ");
//            String answer = sc.next();
//            if (answer.equalsIgnoreCase("Yes")) {
//                Thread imageTh = new ImageServer(socket);
//                imageTh.start();
//                System.out.println("사진 전송 완료");
//            }
//        }
    }
}
class ImageServer extends Thread {
    Socket socket;
    String fileName;
    static ArrayList<Socket> sockets = new ArrayList<>(); // 클래스 소속의 list, 클래스가 만들어질 때 한번 생성)

    public ImageServer(Socket socket, String fileName) {
        this.socket = socket; // 클라이언트에 대한 소켓 식별자
        this.fileName = fileName; // 전송할 파일 이름을 키보드로부터 입력받아 매개변수로 전달
        sockets.add(socket); // 클래스 소속의 리스트에 생성된 소켓의 식별자를 추가
    }
    @Override
    public void run() {
        int len;
        byte[] buffer = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(fileName);
            for(int i = 0; i < sockets.size(); i++) {
//                File file = new File("src/이미지파일전송하기/bear.png");
                OutputStream os = sockets.get(i).getOutputStream();
//                int c;
                while((len = fis.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }
                os.flush();
                os.close();
//                fis.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress() + "에게 전송 완료");
            }
        } catch (IOException e) {}
    }
}


