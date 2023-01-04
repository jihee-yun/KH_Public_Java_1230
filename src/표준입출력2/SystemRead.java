package 표준입출력2;
// ? .... 1도 모르겠음
import java.io.IOException;

public class SystemRead {
    public static void main(String[] args) {
        while(true){
            try {
                int keyCode = System.in.read();
                System.out.println("KeyCode : " + keyCode);
                if(keyCode == 'q') break;
            } catch(IOException e){
                e.printStackTrace();
            }


        }
    }
}
