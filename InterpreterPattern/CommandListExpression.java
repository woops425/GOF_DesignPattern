package InterpreterPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListExpression implements Expression {
    // CommandExpression 타입의 필드를 가짐
    private ArrayList<CommandExpression> commands = new ArrayList<CommandExpression>();

    @Override
    public boolean parse(Context context) {
        while(true) {
            String currentKeyword = context.getCurrentKeyword();

            if (currentKeyword == null) {
                return false;
            } else if (currentKeyword.equals("END")) {
                context.readNextKeyword();
                break;
            } else {
                CommandExpression command = null;

                // Loop 문자열이라면, LoopCommandExpression 객체를 생성
                if (LoopCommandExpression.checkValidKeyword(currentKeyword)) {
                    command = new LoopCommandExpression(currentKeyword);
                    // 현재 문자열이 FRONT나 BACK, LEFT, RIGHT 문자열인지 검사하고, 만약 맞다면 ActionCommandExpression 객체를 생성
                } else if (ActionCommandExpression.checkValidKeyword(currentKeyword)) {
                    command = new ActionCommandExpression(currentKeyword);
                }

                // 앞서 생성된 객체들은 모두 이 command 변수에 할당됨
                if (command != null) {
                    // 할당 되었다면, 해당 command의 parse 메서드를 호출해서 script의 다음 구문을 해석하도록 함.
                    // 해석에 성공하면 commands에 추가하고, 실패하면 false를 반환
                    if (command.parse(context)) {
                        commands.add(command);
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean run() {
        Iterator<CommandExpression> iter = commands.iterator();

        while(iter.hasNext()) {
            boolean bOK = iter.next().run();
            if (!bOK) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return commands.toString();
    }
}
