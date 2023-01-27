package ArrayList;

import java.util.*;

// 특정 위치에 삽입 : add()

public class ArrayListEx {
    public static void main(String[] args) {
//        List<String> pitches = new LinkedList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142"); // 계속 뒤에 추가
//        pitches.add(0, "150"); // 특정 위치에 값을 삽입
//        System.out.println(pitches);
//        System.out.println(pitches.get(1)); // 해당 인덱스의 값을 출력
//        System.out.println(pitches.size()); // 내부 요소의 개수를 반환
//        System.out.println(pitches.contains("142")); // 해당 값이 내부에 있는지 확인 (o : true, x : false)
//        System.out.println(pitches.remove("140")); // 해당 값이 있으면 삭제하고 true 반환, 없으면 false
//        System.out.println(pitches.remove(0)); // 해당 인덱스 값 삭제하고 삭제값을 리턴
//        System.out.println(pitches);
        String[] data = {"138", "129", "142", "150", "166", "123"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // 이미 만들어져 있는 배열을 추가
        //String result = String.join(",", pitches); // 콤마로 구분하여 문자열 만들기
        //pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitches);

    }
}
