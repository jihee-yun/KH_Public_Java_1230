package 명함전송서버;

import java.io.Serializable;

public class NameCardInfo implements Serializable {
    private String name;
    private String phoneNumber;
    private String eMail;
    private String address;

    public NameCardInfo(String name, String phoneNumber, String eMail, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Object printNameCard() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("이메일 : " + eMail);
        System.out.println("주소 : " + address);
        System.out.println("-------------------------");
        return null;
    }
}
