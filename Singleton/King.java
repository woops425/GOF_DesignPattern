package Singleton;

public class King {
    private King() {}

    private static King self = null; // 자기 자신만이 필드에 접근할 수 있게 private으로 지정, 대신 클래스 이름으로 접근할 수 있게
    // 정적 필드로 정의하기 위해 static으로 지정

    public synchronized static King getInstance() { // synchronized로 지정한 이유는, 멀티스레드에서 이 메서드를 호출할 때 문제가 없게 동기화 하기 위함
        if (self == null) {
            self = new King();
        }
        return self; // 인스턴스 메서드가 호출되지 않으면, 이 클래스의 객체는 한 개도 생성되지 않을것임
    }
    public void say() {
        System.out.println("I am only one..");
    }
}
