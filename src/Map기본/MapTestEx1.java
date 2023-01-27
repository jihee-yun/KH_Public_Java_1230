package Map기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값의 쌍(pair)으로 구성되어 있음. 키는 중복될 수 없고 값은 중복 가능
// 키의 중복 여부 확인은 HashCode 를 이용
// hash 알고리즘의 특징은 키 값을 해시함수의 입력으로 전달하여 정수값의 결과를 반환
public class MapTestEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 99); // 키 값이 같기 때문에 나중에 들어온 값으로 대체
        System.out.println("총 Entry 수 : " + map.size()); // map 객체 수 확인
        // 객체 찾기
        System.out.println(map.get("동그라미"));
        // map 요소 순회 방법 (반복자 : iterator 사용)
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while(iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + " : " + value);
//        }
        map.remove("최수연"); // 키로 Map.entry 제거
        System.out.println("총 Entry 수 : " + map.size());
        // replace() 메소드를 이용해 값 수정
        map.replace("이준호", 91);
        map.replace("이주호", 91);
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        map.clear(); // 객체 전체 삭제
        System.out.println("총 Entry 수 : " + map.size());
    }
}
