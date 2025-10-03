package MediatorMethod;

import java.util.Scanner;

public class MainEntry {

   /* Mediator 패턴의 장점과 단점
    장점
    결합도 감소 (Loose Coupling): 객체 간의 직접적인 연결이 사라지고 Mediator에만 의존하게 되므로, 개별 객체의 수정이 다른 객체에 미치는 영향이 적어집니다.
    중앙 집중화된 제어: 객체 간의 복잡한 상호작용 로직이 하나의 Mediator 클래스에 모여있어 전체 시스템의 동작을 이해하고 관리하기 쉽습니다.
    재사용성 증가: 각 Colleague 객체는 다른 Colleague와 직접적인 관련이 없으므로 다른 시스템에서 재사용하기가 더 용이합니다.

    단점
    Mediator의 복잡성 증가: 모든 상호작용이 Mediator에 집중되므로, 시스템이 복잡해질수록 Mediator 클래스가 거대해지고 관리하기 어려워질 수 있습니다.
     (흔히 "God Object"가 될 수 있다고 말합니다.)
    */
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        try(Scanner scanner = new Scanner(System.in)) {
            do {
                home.report();

                System.out.println("[1] 문 열기");
                System.out.println("[2] 문 닫기");
                System.out.println("[3] 창문 열기");
                System.out.println("[4] 창문 닫기");
                System.out.println("[5] 에어컨 켜기");
                System.out.println("[6] 에어컨 끄기");
                System.out.println("[7] 보일러 켜기");
                System.out.println("[8] 보일러 끄기");

                System.out.print("명령: ");
                int i = scanner.nextInt();

                if (i == 1) home.door.open();
                else if (i == 2) home.door.close();
                else if (i == 3) home.window.open();
                else if (i == 4) home.window.close();
                else if (i == 5) home.aircon.on();
                else if (i == 6) home.aircon.off();
                else if (i == 7) home.boiler.on();
                else if (i == 8) home.boiler.off();

            } while (true);
        }
    }
}
