package DecoratorPattern;

import javax.swing.*;

/* 데코레이터 패턴(Decorator Pattern): 객체의 결합을 통해 기능을 동적으로 확장할 수 있게 해주는 구조적 디자인 패턴.
상속을 사용하지 않고도 런타임(실행 중)에 객체에 새로운 책임이나 행동을 유연하게 추가할 수 있음.

이 패턴은 래퍼(Wrapper)라고도 불리며, 기본 객체를 감싸는 '데코레이터(장식자)' 객체를 만들어, 이 데코레이터가 추가적인 기능을 수행하도록 함.

장점
유연한 기능 확장: 상속 대신 조합을 사용하여 런타임에 동적으로 기능을 추가하거나 제거할 수 있음
클래스 폭발 방지: 모든 기능 조합을 위한 하위 클래스를 만들 필요가 없음
단일 책임 원칙(SRP) 준수: 기능들이 각각 별개의 데코레이터 클래스로 분리됨
개방-폐쇄 원칙(OCP) 준수: 기존 코드를 수정하지 않고도 새로운 데코레이터를 만들어 기능을 확장할 수 있음.

단점
많은 수의 작은 객체: 기능을 추가할 때마다 새로운 데코레이터 객체가 생성되어, 구조가 복잡해지고 관리할 객체 수가 늘어날 수 있음
복잡한 디버깅: 객체가 여러 겹으로 래핑되어 있을 경우, 코드의 흐름을 추적하거나 디버깅하기가 다소 까다로울 수 있음
객체의 정체성 문제: 데코레이터로 감싸진 객체는 원본 객체와는 다른 객체로 취급될 수 있음 (예: instanceof 검사 시)
*/

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
