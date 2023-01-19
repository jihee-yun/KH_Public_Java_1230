package 코코아톡;
// 인터페이스의  메소드는 자동으로 public abstract 로 만들어진다
public interface NetAdaptor {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >>" + msg);
    }
}

class FiveG implements NetAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}