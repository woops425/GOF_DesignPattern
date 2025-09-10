package Singleton;

/*
 싱글턴 패턴은 특정 클래스의 인스턴스(객체)가 프로그램 내에서 오직 하나만 생성되도록 보장하고,
 이렇게 생성된 단일 인스턴스에 대한 전역적인 접근점(Global Access Point)을 제공하는 디자인 패턴
 */

public class MainEntry {
    public static void main(String[] args) {
//        King king = new King();
        King king = King.getInstance();

        king.say();

        King king2 = King.getInstance();
        if (king == king2) {
            System.out.println("same object");
        }
        else {
            System.out.println("different object");
        }
    }
}
