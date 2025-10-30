package InterpreterPattern;

public interface Expression {
    // 컨텍스트가 제공하는 구문이 올바른지 확인하고, 구문에 대한 구체적인 구문 클래스 객체를 생성해주는 역할
    boolean parse(Context context);
    // 구문에 대한 어떤 기능을 실행
    boolean run();
}
