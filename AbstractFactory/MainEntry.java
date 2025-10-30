package AbstractFactory;

public class MainEntry {
    public static void main(String[] args) {
//        ComponentFactory factory = new WindowsFactory();
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.createTextEdit("디자인패턴");

        button.render();
        checkBox.render();
        textEdit.render();
    }
}
