package PrototypePattern;

public interface Prototype {
    // 대부분의 prototype 패턴에서의 copy() 메서드의 반환 타입은 최상위 클래스인 Object와 같은 타입을 자주 사용함
    Object copy();
}
