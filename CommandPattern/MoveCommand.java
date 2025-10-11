package CommandPattern;


/**
 ConcreteCommand: 터미널의 커서 위치를 이동시키는 명령을 캡슐화
 Command 인터페이스를 구현
 */
public class MoveCommand implements Command {
    private int x;
    private int y;

    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println(String.format("\u001B[%d;%dH", y, x));
    }
}
