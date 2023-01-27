package 해시맵커피;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("---------------------------");
                    }
                    break;
                case 2:
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
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
                        System.out.print("설명 : ");
                        String desc = sc.next();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 메뉴를 다시 선택하세요.");
            }
        }
    }
}

