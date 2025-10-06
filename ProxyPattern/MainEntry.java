package ProxyPattern;

public class MainEntry {

    /* 프록시 패턴은 이름 그대로 **'대리인(Proxy)'**을 내세우는 디자인 패턴이다. 어떤 객체(실제 객체)에 대한 접근을 제어하기 위해, 이 객체를 대신하는 대리인 객체를 제공한다.

클라이언트(사용자)는 실제 객체에 직접 접근하는 대신 대리인 객체를 통해 작업을 요청한다. 그러면 대리인 객체는 요청을 중간에 가로채서 부가적인 작업을 수행하거나,
흐름을 제어한 뒤 실제 객체에게 요청을 전달한다.

흐름 제어 및 기능 추가: 실제 객체의 기능에 무언가를 덧붙일 수 있다.
코드의 예시: ScreenDisplay는 print를 호출할 때마다 0.5초의 지연이 발생하는 "비싼" 작업. 만약 BufferDisplay(프록시)가 없다면, print를 호출할 때마다 0.5초씩 기다려야 한다.
하지만 BufferDisplay는 요청을 바로 전달하지 않고 **버퍼링(buffering)**이라는 추가 기능을 제공. 요청을 모아두었다가 버퍼가 꽉 찼을 때 한 번에 처리(flush)함으로써,
ScreenDisplay의 print 호출 횟수를 줄여 시스템의 부하를 줄여준다.

지연 초기화 (Lazy Initialization): 정말 필요할 때까지 실제 객체를 생성하지 않는다.
코드의 예시: ScreenDisplay 객체는 생성되거나 사용하는 데 비용이 많이 드는 객체일 수 있다. BufferDisplay의 flush 메소드를 보면 if (screen == null) 이라는 조건문이 있다.
이것은 flush()가 처음 호출되기 전까지는 ScreenDisplay 객체를 아예 생성하지 않다가, 실제로 화면 출력이 필요한 첫 순간에 객체를 생성하는 것을 의미. 이로써 불필요한 자원 낭비를 막을 수 있다.
     */
    public static void main(String[] args) {
//        Display display = new ScreenDisplay();
        Display display = new BufferDisplay(5);

        display.print("안녕하세요.");
        display.print("소프트웨어 설계를 위한 디자인 패턴은");
        display.print("이해하기 난해한 부분도 있지만");
        display.print("이해하고 개발에 적용을 하면");
        display.print("큰 규모의 소프트웨어 개발에 큰 도움이 됩니다.");
        display.print("또한 유지보수와 기능 확장에도 매우 도움이 됩니다.");

        ((BufferDisplay)display).flush(); // buffer의 내용을 buffer의 크기와 상관없이 출력하게끔 함
    }
}
