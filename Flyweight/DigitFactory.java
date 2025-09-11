package Flyweight;

// Flyweight 객체들의 생성과 반환을 책임지는 클래스
public class DigitFactory {
    private Digit[] pool = new Digit[] {
            null, null, null, null, null, null, null, null, null, null
    };

    // 클라이언트가 getDigit(n)를 통해 객체를 요청하면, 먼저 풀에 해당 객체가 이미 생성되어 있는지 확인
    // 있으면 기존 객체 반환, 없으면 새로운 객체 생성하여 풀에 저장한 뒤 반환
    // 이를 통해 예를 들어 숫자 434331을 표현할 때 Digit 객체는 6개가 아닌 3개만 생성됨
    public Digit getDigit(int n) {
        if (pool[n] != null) {
            return pool[n];
        } else {
            String fileName = String.format("%d.txt", n);
            Digit digit = new Digit(fileName);
            pool[n] = digit;
            return digit;
        }
    }
}
