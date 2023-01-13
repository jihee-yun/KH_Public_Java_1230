package 접근제한자;

// 접근제한자란? 객체지향 4대 특성 중 하나이며, 데이터 은닉(캡슐화)의 핵심 개념
// 데이터은닉이란? 사용자가 알 필요가 없거나 숨겨야 할 정보를 보이지 않도록 하는 개념
// 대형 프로젝트 진행 중 필드값에 외부 접근이 가능한 경우 여러 문제점이 발생할 수 있다
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs);
    }
}
class ChildRest extends ParentRest {
    String jobs;

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() { // protected 대한 접근 (동일 패키지 또는 상속 관계 성립하면 접근 허용)
        return money;
    }
    public String getName() { // default 대한 접근 (동일 패키지만 접근 허용)
        return name;
    }
    public String getAddr() { // private 대한 접근
        return addr;
    }
}
