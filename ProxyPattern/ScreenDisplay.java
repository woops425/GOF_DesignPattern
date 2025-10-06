package ProxyPattern;

public class ScreenDisplay implements Display {

    @Override
    public void print(String content) {
        try {
            Thread.sleep(500); // 출력을 위한 준비 작업. 0.5초 정도 블럭되는 코드가 이에 해당함
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }
}
