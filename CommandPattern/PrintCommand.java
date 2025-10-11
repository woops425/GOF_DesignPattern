package CommandPattern;


/**
 ConcreteCommand: 특정 문자열을 터미널에 출력하는 명령을 캡슐화
 Command 인터페이스를 구현
 */
public class PrintCommand implements Command {
    private String content;

    public PrintCommand(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        System.out.print(content);
    }
}
