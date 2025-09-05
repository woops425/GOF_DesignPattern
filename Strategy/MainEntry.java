package Strategy;
// Strategy 패턴 : 하나의 작업을 수행하는 여러가지 방법(ex.알고리즘)이 있고, 그 방법들을 상황에 따라 바꿔서 사용해야 할 때 유용한 패턴
// ex) 사용자가 선택한 결제 방식에 따라 결제 로직 동적으로 변, 데이터 압축, 유효성 검, 정렬 알고리즘 등

public class MainEntry {
    public static void main(String[] args) {
        SumPrinter cal = new SumPrinter();

        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 10);
    }
}

/*전략 패턴을 사용하면 다음과 같은 강력한 장점들을 얻을 수 있습니다.

개방-폐쇄 원칙 (OCP, Open-Closed Principle) 충족

새로운 합계 계산 방식(예: 재귀 함수를 이용한 방식)이 필요하더라도, 기존의 SumPrinter 코드는 전혀 수정할 필요가 없습니다.

새로운 RecursiveSumStrategy 클래스를 만들어 SumStrategy 인터페이스를 구현하기만 하면 됩니다.

기능 확장에는 열려(Open)있고, 기존 코드의 변경에는 닫혀(Closed)있게 되어 유지보수가 매우 용이해집니다.

알고리즘 교체의 용이성

        MainEntry에서 보듯이, cal.print(new SimpleSumStrategy(), 10)를 cal.print(new GaussSumStrategy(), 10)로 바꾸는 것처럼, 클라이언트(사용자)는 필요에 따라 언제든지 알고리즘(전략)을 쉽게 교체하여 사용할 수 있습니다.

코드의 응집도 향상 및 분리

합계를 구하는 다양한 알고리즘들이 if-else나 switch문으로 SumPrinter 내부에 복잡하게 얽혀있는 대신, 각각의 클래스로 분리됩니다.

이를 통해 각 알고리즘은 자신만의 책임(합계 계산)에만 집중하게 되어 **단일 책임 원칙(SRP, Single Responsibility Principle)**을 잘 따르게 됩니다. 코드를 이해하고 관리하기가 훨씬 수월해집니다.

상속 대신 위임(Delegation) 활용

SumPrinter가 합계를 구하는 방법을 상속받는 대신, SumStrategy 객체에게 계산을 '위임'합니다.

이를 통해 상속으로 인한 강한 결합을 피하고, 더 유연하고 확장성 있는 구조를 만들 수 있습니다.

테스트 용이성

각각의 전략(SimpleSumStrategy, GaussSumStrategy)을 독립적으로 단위 테스트(Unit Test)하기가 매우 쉽습니다. SumPrinter와 완전히 분리하여 각 알고리즘의 정확성을 검증할 수 있습니다. */