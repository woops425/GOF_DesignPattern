package FacadePattern;

// 개발자는 어떤 기능을 수행하기 위해 여러 개의 클래스를 파악하지 않고도, Facade에 해당하는 클래스만 이해하고 사용하면 됨.
// 또, 다른 개발자에게 제공하는 라이브러리나 패키지 형태로 코드를 제공할 때, Facade 패턴을 적용하면, Facade에 해당하는 클래스만 공개하고,
// 그 외의 클래스는 비공개 처리 해도 됨. 부담을 줄여주는 역할.

/*
Facade(퍼사드) 패턴은 복잡한 서브시스템(여러 개의 클래스, 라이브러리 등)에 대한 단순하고 통합된 인터페이스(창구)를 제공하는 구조 디자인 패턴.
 즉, 여러 개의 복잡한 클래스들을 직접 다루는 대신, 이들을 감싸는 단 하나의 클래스(Facade)를 만들어 클라이언트가 이 클래스만 사용하도록 하는 방식

 Facade 패턴의 주된 목적은 복잡성을 숨기고 결합도를 낮추는 것

 Facade 패턴의 장점
단순성: 클라이언트가 사용하기 매우 쉬워짐. 복잡한 서브시스템을 몰라도 됨.
결합도 감소 (Decoupling): 클라이언트와 서브시스템 간의 의존성이 분리 됨
유지보수성 향상: 나중에 Cache 로직을 바꾸거나 DBMS를 다른 종류로 변경하더라도, Facade 클래스 내부만 수정하면 됨. 클라이언트 코드(MainEntry)는 전혀 수정할 필요가 없음.
 */
public class MainEntry {
    public static void main(String[] args) {
//        DBMS dbms = new DBMS();
//        Cache cache = new Cache();
        Facade facade = new Facade();

        String name = "Sangwoo";

//        Row row = cache.get(name);
//        if (row == null) {
//            row = dbms.query(name);
//            if (row != null) {
//                cache.put(row);
//            }
//        }
//
//        if (row != null) {
//            Message message = new Message(row);
//
//            System.out.println(message.makeName());
//            System.out.println(message.makeBirthday());
//            System.out.println(message.makeEmail());
//        } else {
//            System.out.println(name + " is not exists. ");
//        }
        facade.run(name);
    }
}
