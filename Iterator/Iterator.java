package Iterator;

public interface Iterator {
    boolean next(); // Aggregator의 다음 구성 데이터를 얻을 수 있도록 하고, 다음 구성 데이터를 얻을 수 있다면 True를 반환, 아니면 False 반환
    Object current();   // 구성 데이터를 하나 얻어 반환, 구성 데이터의 타입은 정해지지 않아야 하므로 Object 타입으로 반환
}
