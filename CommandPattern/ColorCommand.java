package CommandPattern;


/**
 ConcreteCommand: 터미널의 글자색을 변경하는 명령을 캡슐화
 Command 인터페이스를 구현
 */
public class ColorCommand implements Command {

    // 제어문자열 값은 생성자의 Color 인자에 전달 됨
    public enum Color {
        BLACK("\u001B[30m"), RED("\u001B[31m"),
        GREEN("\u001B[32m"), YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"), PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"), WHITE("\u001B[37m");

        final private String code;

        private Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    };

    private Color color;

    public ColorCommand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.print(color.getCode());
    }
}
