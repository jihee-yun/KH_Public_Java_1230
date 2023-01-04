package While문기본;
// 정해진 횟수 반복하기
public class WhileEx1 {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true) { // 무한의 반복 조건
            treeHit++; // 변수값 1 증가, 여기선 전후 상관 없음
            System.out.println("나무를 " + treeHit + "찍었습니다");
            if(treeHit == 10) {
                System.out.println("나무가 넘어 갑니다.");
                break; // 반복문 탈출
            }
        }
    }
}
