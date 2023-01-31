package 큐연습;
// FIFO 구조, LinkedList 를 활용하여 생성하며 LinkedList 의 모든 메소드를 사용하지 않고
// Queue 구현에 필요한 기능만 제공
// add(E e) : 큐의 맨 뒤에 요소를 추가
// peek() : 큐의 맨 앞에 있는 요소를 확인
// remove() : 맨 앞에 있는 요소를 추출
// boolean offer(O o) : 객체를 삽입 (맨 뒤에)
// Object poll() : 객체를 추출 (맨 앞에서)
// Object element() : 삭제 없이 요소를 읽어 옴
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        msgQueue.offer(new Message("SMS", "유나"));
        msgQueue.offer(new Message("Mail", "정국"));
        msgQueue.offer(new Message("Kakao", "카리나"));

        while(!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "Kakao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
