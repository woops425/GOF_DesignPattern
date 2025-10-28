package BuilderPattern_2;

// 탬플릿 패턴, 퍼사드 패턴, 스트래티지 패턴을 객체의 생성에 적용한 것으로도 볼 수 있음
// 하나의 독립적인 패턴이라기 보단, 다른 패턴의 응용으로 볼 수 있음

public class MainEntry {
    public static void main(String[] args) {
        Data data = new Data("Jane", 25);

        Builder builder = new PlainTextBuilder(data);
        Director director = new Director(builder);
        String result = director.build();
        System.out.println(result);

        builder = new JSONBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);

        builder = new XMLBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);
    }
}
