package InterpreterPattern;

public class BeginExpression implements Expression {
    // BEGIN 구문과 END 구문 사이에 있는 모든 구문들을 처리해야함
    // 그래서, CommandListExpression 클래스의 객체를 필드로 가짐
    private CommandListExpression expression;

    @Override
    //checkValidKeyword 메서드를 이용하여 현재 구문이 올바른지 확인.
    public boolean parse(Context context) {
        if (checkValidKeyword(context.getCurrentKeyword())) {
            // 현재 구문이 "BEGIN"이면, 다음 구문을 처리
            context.readNextKeyword();
            // BEGIN 과 END 사이의 구문들을 담을 CommandListExpression 객체를 생성
            expression = new CommandListExpression();
            return expression.parse(context);
        } else {
            return false;
        }
    }

    @Override
    public boolean run() {
        return expression.run();
    }

    public static boolean checkValidKeyword(String keyword) {
        return keyword.equals("BEGIN");
    }

    @Override
    public String toString() {
        return "BEGIN" + expression;
    }
}
