package CommandPattern;

import java.util.ArrayList;


/**
 CompositeCommand: 여러 개의 Command 객체를 그룹으로 묶어 하나의 명령처럼 다룰 수 있게 함
 이 클래스 자체도 Command 인터페이스를 구현하여, 단일 커맨드와 동일한 방식으로 취급될 수 있음 (Composite Pattern)
 Invoker(호출자) 역할을 수행하여 내부에 저장된 커맨드들을 순차적으로 실행
 */
public class CommandGroup implements Command {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void run() {
        int cntCommands = commands.size();
        for (int i=0; i<cntCommands; i++) {
            Command command = commands.get(i);
            command.run();
        }
    }
}
