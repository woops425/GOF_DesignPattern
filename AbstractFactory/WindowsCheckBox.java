package AbstractFactory;

public class WindowsCheckBox extends CheckBox {
    public WindowsCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println(
                "Windows 렌더링 API를 이용해 "
                + (this.bChecked ? "체크된" : "체크 안 된")
                + " 체크 박스를 그립니다.");
    }

}
