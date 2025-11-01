package VisitorPattern;

public class SumVisitor implements Visitor {
    private int sum = 0;

    public int getValue() {
        return sum;
    }


    @Override
    public void visit(Unit unit) {
        // 방문한 데이터가 Item 클래스라면, 정수값을 가진 단일 데이터라는 뜻.
        // 이 경우에는 Item 클래스로 형변환 하여 정수값을 얻은 뒤에 sum 필드에 더해줌.
        if (unit instanceof Item) {
            sum += ((Item)unit).getValue();
            // 단일 데이터가 아니라면, unit 객체에 대해 accept() 메서드를 호출함
            // 이 코드를 통해, 집합 데이터가 포함하고 있는 모든 데이터들을 방문하고 Visitor 객체에서 처리할 수 있도록 함
        } else {
            unit.accept(this);
        }
    }
}
