package CommandPattern;


/**
 ConcreteCommand: 터미널 화면을 깨끗하게 지우는 명령을 캡슐화
 Command 인터페이스를 구현
 */
public class ClearCommand implements Command {

    @Override
    public void run() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
