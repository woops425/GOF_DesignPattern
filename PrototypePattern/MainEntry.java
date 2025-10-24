package PrototypePattern;
/*
프로토타입 패턴은 '견본' 또는 '원형'을 의미하는 프로토타입(prototype) 객체를 복사하여 새로운 객체를 생성하는 생성 패턴(Creational Pattern).
새로운 객체를 new 키워드로 생성하고 모든 필드를 일일이 초기화하는 대신, 이미 필요한 상태를 가진 객체를 '복사'해서 사용.
템플릿처럼 미리 만들어 둔 원본 객체를 복제하여 새 객체를 만드는 방식

얕은 복사 (Shallow Copy): 객체의 최상위 필드만 복사함. 만약 필드가 다른 객체를 참조(주소값)하고 있다면, 그 참조(주소값)만 복사.
결과: 원본 객체와 복사본 객체가 내부의 동일한 객체를 공유하게 됨. 복사본의 내부 객체를 수정하면 원본에도 영향이 감.

깊은 복사 (Deep Copy): 객체 자신뿐만 아니라, 그 객체가 참조하는 모든 하위 객체들까지 재귀적으로 복사하여 완전히 새로운 객체를 만듦.
결과: 원본 객체와 복사본 객체는 완전히 독립적. 복사본을 아무리 수정해도 원본에 영향을 주지 않음.

프로토타입 패턴은 일반적으로 '깊은 복사'를 통해 객체의 완전한 독립성을 보장하는 것을 목표로 함.

추가로 이 예제 코드에서는 Rectangle 클래스가 없음에도 사각형 도형을 만들었음. 새로운 클래스 없이 특정 기능을 수행하려 할 때에도 적합한 패턴 방식
 */
public class MainEntry {
    public static void main(String[] args) {
        Point pt1 = new Point();
        pt1.setX(0).setY(0);
//        System.out.println(pt1.draw());

        Point pt2 = new Point();
        pt2.setX(100).setY(0);
//        System.out.println(pt2.draw());

        Line line1 = new Line();
        line1.setStartPoint(pt1).setEndPoint(pt2);
//        System.out.println(line1.draw());

        Line lineCopy = (Line)line1.copy();

        Point pt3 = new Point();
        pt3.setX(100).setY(100);

        Point pt4 = new Point();
        pt4.setX(0).setY(0);

        Line line2 = new Line();
        line2.setStartPoint(pt2).setEndPoint(pt3);

        Line line3 = new Line();
        line3.setStartPoint(pt3).setEndPoint(pt4);

        Line line4 = new Line();
        line4.setStartPoint(pt4).setEndPoint(pt1);

        Group rect = new Group("RECT");
        rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
//        System.out.println(rect.draw());

        Group cloneRect = (Group)rect.copy();
        cloneRect.moveOffset(100, 100);

        System.out.println(cloneRect.draw());
        System.out.println(rect.draw());
    }
}
