package ProxyPattern;

import java.util.ArrayList;

public class BufferDisplay implements Display {
    private ArrayList<String> buffer = new ArrayList<String>();
    private ScreenDisplay screen; // 출력에 대한 작업을 진짜로 수행 해주는 ScreenDisplay 객체를 필드로 추가
    private int bufferSize;

    public BufferDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        buffer.add(content); // 출력할 데이터를 바로 출력하는 것이 아니라, 우선 buffer에 저장
        if (buffer.size() == bufferSize) {
            flush();
        }
    }

    // 실제 출력 기능을 수행하는 screen 객체가 아직 생성되지 않았으면, 생성해주고 buffer에 저장된 데이터를 진짜로 출력하기 위해 전처리 진행.
    // 전처리 된 데이터를 출력, buffer를 초기화
    public void flush() {
        if (screen == null) {
            screen = new ScreenDisplay();
        }
        for (String content : buffer) {
            screen.print(content);
        }
        buffer.clear();
    }
}
