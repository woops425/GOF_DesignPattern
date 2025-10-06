package DecoratorPattern;

import javax.swing.*;

public class MainEntry {
    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.add("Hello");
        strings.add("My name is sangwoo park.");
        strings.add("I am a student");
        strings.add("Design-pattern is powerful tool.");

//        strings.print();

        Item decorator = new SideDecorator(strings, '\"');
        decorator = new LineNumberDecorator(decorator);
        decorator = new BoxDecorator(decorator);
        decorator.print();
    }
}
