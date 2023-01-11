package 아이패드만들기;

public class IPadMake {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro ipad = new IPadPro("iPad Pro");
            if(!ipad.continueOrder()) break;
            ipad.setScreen();
            ipad.setColor();
            ipad.setMemory();
            ipad.setNetwork();
            ipad.setName();
            ipad.setSerialNum();
            ipad.inProductionPad();
            ipad.viewProductPad();
        }
    }
}
