package MediatorMethod;

public class SmartHome implements Mediator {
    public Door door = new Door(this);
    public Window window = new Window(this);
    public CoolAircon aircon = new CoolAircon(this);
    public HeatBoiler boiler = new HeatBoiler(this);

    @Override
    public void participantChanged(Participant participant) {
        // 문이 열린 상태 -> 에어컨, 보일러 끄기
        if (participant == door&&!door.isClosed()) {
            aircon.off();
            boiler.off();
        }

        // 창문이 열린 상태 -> 에어컨, 보일러 끄기
        if (participant == window && !window.isClosed()) {
            aircon.off();
            boiler.off();
        }

        // 에어컨이 켜진 상태 -> 보일러 끄고, 창문과 문 닫기
        if (participant == aircon && aircon.isRunning()) {
            boiler.off();
            window.close();
            door.close();
        }

        // 보일러가 켜진 상태 -> 에어컨 끄고, 창문, 문 닫기
        if (participant == boiler && boiler.isRunning()) {
            aircon.off();
            window.close();
            door.close();
        }
    }

    public void report() {
        // "\033[H\033[2J"는 "커서를 화면의 맨 위, 맨 앞으로 이동시킨 후, 화면의 모든 내용을 지워라" 라는 의미의 터미널 명령어
        // 결과적으로 SmartHome 클래스의 report() 메서드가 호출될 때마다 콘솔 화면이 깨끗하게 지워지고, 그 자리에 새로운 [집안 상태]가 출력
        System.out.println("\033[H\033[2J[집안 상태]");
        System.out.println(door);
        System.out.println(window);
        System.out.println(aircon);
        System.out.println(boiler);
        System.out.println();
    }
}
