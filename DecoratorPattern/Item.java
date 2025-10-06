package DecoratorPattern;

public abstract class Item {
    public abstract int getLinesCount(); // 문자열이 몇 줄인지를 반환.
    public abstract int getMaxLength(); // 문자열 중, 가장 긴 문자열의 길이를 반환
    public abstract int getLength(int index); // 지정된 인덱스의 문자열의 길이를 반환
    public abstract String getString(int index);// 지정된 인덱스의 문자열을 반환

    // 순서대로 문자열을 얻어와 출력해주는 print() 메소드
    public void print() {
        int cntLines = getLinesCount();
        for (int i=0; i<cntLines; i++) {
            String string = getString(i);
            System.out.println(string);
        }
    }
}
