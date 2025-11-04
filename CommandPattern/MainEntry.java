package CommandPattern;


/**
 Client: 커맨드 패턴의 클라이언트 역할을 하는 메인 실행 클래스
 1. 필요한 ConcreteCommand 객체들을 생성 (요청 생성)
 2. 생성된 커맨드들을 Invoker(CommandGroup)에 등록
 3. 최종적으로 Invoker의 실행 메소드를 호출하여 모든 작업을 시작시킴
 Invoker(호출자)와 수신자 클래스 간의 관계
 */
public class MainEntry {
    public static void main(String[] args) {
        CommandGroup cmdGroup = new CommandGroup();

        Command clearCmd = new ClearCommand();
//        clearCmd.run();
        cmdGroup.add(clearCmd);

        Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
//        yellowColorCmd.run();
        cmdGroup.add(yellowColorCmd);

        Command moveCmd = new MoveCommand(10, 1);
//        moveCmd.run();
        cmdGroup.add(moveCmd);

        Command printCmd = new PrintCommand("안녕하세요, 디자인패턴");
//        printCmd.run();
        cmdGroup.add(printCmd);

        Command moveCmd2 = new MoveCommand(15,5);
//        moveCmd2.run();
        cmdGroup.add(moveCmd2);

//        printCmd.run();
        cmdGroup.add(printCmd);

        Command moveCmd3 = new MoveCommand(25, 8);
//        moveCmd3.run();
        cmdGroup.add(moveCmd3);

        Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
//        greenColorCmd.run();
        cmdGroup.add(greenColorCmd);

//        printCmd.run();
        cmdGroup.add(printCmd);

        cmdGroup.run();
    }
}
