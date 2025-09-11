package Flyweight;

/* 객체를 대량으로 생성할 때 메모리 사용량을 줄이기 위한 디자인 패턴.
수많은 객체가 공유할 수 있는 공통적인 상태(Intrinsic State)와 각각의 객체가 가져야 할 고유한 상태(Extrinsic State)를
분리하여, 공통 상태를 가진 객체를 공유함으로써 메모리를 절약
 */
public class MainEntry {
    public static void main(String[] args) {
        Number number = new Number(434331);
        number.print(5, 5);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
