package CommandPattern;

/**
 Command 인터페이스
 모든 커맨드 객체들이 구현해야 할 공통된 실행 메소드 'run()'을 정의
 이 인터페이스 덕분에 호출자(Invoker)는 구체적인 커맨드 클래스를 몰라도 일관된 방식으로 모든 커맨드를 실행할 수 있음
 */
public interface Command {
    public void run();
//    public void undo();
}
