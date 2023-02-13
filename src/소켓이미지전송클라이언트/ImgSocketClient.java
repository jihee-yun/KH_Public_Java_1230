package 소켓이미지전송클라이언트;
// 서버에서 파일이 전송되었습니다. 저장할 경로를 지정하세요.
// 해당 경로로 파일 저장
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class ImgSocketClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 1591);
            System.out.println("[서버 연결 성공]");
            System.out.print("저장할 위치를 지정 하세요(경로/파일명) : ");
            String path = sc.nextLine();
            InputStream is = socket.getInputStream();
            FileOutputStream fops = new FileOutputStream(path);
            int c;
            while ((c = is.read()) != -1) {
                fops.write(c);
            }
            fops.flush();
            fops.close();
            is.close();
        } catch (IOException e) {}
    }
}
