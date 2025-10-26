package BuilderPattern_1;

import java.util.Random;

// Builder Pattern
// 복잡한 구성의 객체를 효과적으로 생성하는 패턴
// Builder Pattern은 크게 2가지로 알려져 있는데, 이 MainEntry에서 다루는 내용은
// 생성 시 지정해야 할 인자가 많을 때 사용하는 패턴.
public class MainEntry {
    public static void main(String[] args) {
        Car car1 = new Car("V7", true, "Black", true, false);

        // 하나의 객체에 대해 연속적인 메서드를 호출하는 코딩 방식을 'Method Chaining' 이라고 함
        // 필요한 만큼 스펙을 모두 지정하고, build() 메서드의 호출과 동시에 객체가 생성 됨
        // 실제 객체의 생성을 원하는 만큼 지연 시킬 수 있음
//        Car car2 = new CarBuilder()
//                .setAEB(false)
//                .setAirbag(false)
//                .setCameraSensor(true)
//                .setColor("White")
//                .setEngine("V9")
//                .build();

        CarBuilder builder = new CarBuilder()
                .setAEB(false)
//                .setAirbag(false)
                .setCameraSensor(true)
                .setColor("White")
                .setEngine("V9");
//                .build();

        Random random = new Random();
        Car car2 = builder
                .setAirbag(random.nextInt(2) == 0) // 50% 확률로 에어백의 장착 여부를 결정
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
