package DecoratorPattern;

public class SideDecorator extends Decorator {
    private Character ch;

    public SideDecorator(Item item, Character ch) {
        super(item);
        this.ch = ch;
    }

    @Override
    // 장식 대상이 되는 문자열의 개수를 반환
    public int getLinesCount() {
        return item.getLinesCount();
    }

    @Override
    // 장식 대상이 되는 문자열의 왼쪽과 오른쪽에 문자를 하나씩 붙여줌으로써, 2를 더하여 반환
    public int getMaxLength() {
        return item.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index) + 2;
    }

    @Override
    // 장식 대상이 되는 문자열 좌우에 ch 필드값을 붙여서 반환
    public String getString(int index) {
        return ch + item.getString(index) + ch;
    }
}
