package 기본배열의기타문법;
// 커맨드 라인 입력
public class BasicArrayEtc {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("외부 입력값이 없습니다.");
            System.exit(0); // 프로그램을 강제 종료합니다. 시스템 콜
        }
        String strVal1 = args[0];
        String strVal2 = args[1];

        int num1 = Integer.parseInt(strVal1);
        int num2 = Integer.parseInt(strVal2);
        System.out.println("외부로부터 입력 받은 값 : " + (num1 + num2));
        }

    }

