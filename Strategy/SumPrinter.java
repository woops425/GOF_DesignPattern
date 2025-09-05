package Strategy;

public class SumPrinter {
    // 1부터 N까지의 총합을 출력하는 메서드
    void print(SumStrategy strategy, int N) {
        System.out.printf("The sum of 1 ~ %d : ", N);
        System.out.println(strategy.get(N));
    }
}
