package AbstractFactory;

public class LinuxCheckBox extends CheckBox {

    public LinuxCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println(
                "Linux 렌더링 API를 이용해 "
                + (this.bChecked ? "체크된" : "체크 안 된")
                + " 체크 박스를 그립니다.");
    }


}
