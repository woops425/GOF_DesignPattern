package Adapter;

import java.util.ArrayList;

/* Adapter 패턴 : 수정 할 수 없는 레거시 코드나 외부 라이브러리를 현재 시스템의 인터페이스에 맞춰 재사용 가능.
클라이언트 코드와 Adaptee 코드를 수정하지 않고도 새로운 기능을 통합할 수 있음.
활용 시점 - 기존에 잘 동작하는 클래스를 새로운 인터페이스에 맞게 통합해야 할 때, 여러 클래스의 인터페이스를 통일하여 일관된 방식으로 사용하고 싶을 때.
*/

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("댕이"));
        animals.add(new Cat("솜털이"));
        animals.add(new Cat("츄츄"));
//        animals.add(new Tiger("타이온"));
        animals.add(new TigerAdapter("타이온"));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
