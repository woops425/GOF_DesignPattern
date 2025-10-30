package InterpreterPattern;

import java.util.StringTokenizer;

public class Context {
    // 스크립트 문자열에 대해, 공백문자를 구분자로 하여 분리할 수 있는 StringTokenizer 객체를 필드로 추가
    private StringTokenizer tokenizer;
    private String currentKeyword;

    public Context(String script) {
        tokenizer = new StringTokenizer(script);
        readNextKeyword();
    }

    public String readNextKeyword() {
        if (tokenizer.hasMoreTokens()) {
            currentKeyword = tokenizer.nextToken();
        } else {
            currentKeyword = null;
        }

        return currentKeyword;
    }

    public String getCurrentKeyword() {
        return currentKeyword;
    }
}
