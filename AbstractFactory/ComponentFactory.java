package AbstractFactory;
// 추상 메서드 3개만을 정의하고 있기 때문에, 원한다면 인터페이스로 정의해도 상관 없는 추상 클래스.
public abstract class ComponentFactory {
    public abstract Button createButton(String caption);
    public abstract CheckBox createCheckBox(boolean bChecked);
    public abstract TextEdit createTextEdit(String value);
}
