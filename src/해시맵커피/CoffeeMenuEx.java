package 해시맵커피;

import java.util.*;
// HashMap? 키와 값 pair 로 구성된 형태
// 동일 여부 판단을 HashCode 를 통해서 진행
// 키는 중복 허용하지 않지만 값은 중복 허용
// 순서롤 보장하지 않는다

public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }
    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한 커피입니다."));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 들어있어요."));
        map.put("ColdBrew", new MenuInfo("ColdBrew", 5500, "Coffee", "비싼 커피입니다."));
        map.put("LemonAde", new MenuInfo("LemonAde", 5000, "Ade", "레몬에이드입니다."));
        map.put("PeachAde", new MenuInfo("PeachAde", 5800, "Ade", "복숭아에이드입니다."));
        map.put("BlackTea", new MenuInfo("BlackTea", 5800, "Tea", "홍차입니다."));
        map.put("GreenTea", new MenuInfo("GreenTea", 6000, "Tea", "녹차입니다."));
        map.put("MilkTea", new MenuInfo("MilkTea", 4500, "Tea", "밀크티입니다."));



    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";
        while (true) {
            System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("======== 메뉴 보기 ========");
                    for(String e : map.keySet()) { // 키값 기준으로 향상된 for문 반복 수행
                        System.out.println("메뉴 : " + map.get(e).name); // 키로 해당하는 값을 얻어 냄
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("---------------------------");
                    }
                    break;
                case 2:
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 매개변수로 전달된 키가 Map 내에 존재하는지 확인 (true/false)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("---------------------------");
                    } else System.out.println("해당 메뉴가 없습니다.");
                    break;
                case 3:
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc)); // 키와 값(객체)을 추가
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 삭제할 메뉴가 있는지 확인
                        map.remove(key); // 키로 해당하는 맵의 entry 제거
                        System.out.println(key + " 메뉴를 삭제하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 : ");
                        String desc = sc.nextLine(); // 공백을 입력 받기 위해서
                        map.replace(key, new MenuInfo(key, price, group,desc));
                    } else {
                        System.out.println("수정할 메뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 메뉴를 다시 선택하세요.");
            }
        }
    }
}

