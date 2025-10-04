package MemetoMethod;

import java.util.Random;

public class MainEntry {
    public static void main(String[] args) {
        Walker walker = new Walker(0, 0, 10, 10);
        String[] actions = {"UP", "RIGHT", "DOWN", "LEFT"};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while (true) {
            String action = actions[random.nextInt(4)];
            // 현재 위치에서 목표 위치까지의 거리값이 반환됨
            double distance = walker.walk(action);
            System.out.println(action + " " + distance);

            // 거리가 0이라면, 목표지점에 도착한 것이므로 반복문을 종료
            if (distance == 0.0) {
                break;
            }

            // 현재 거리가 최소 거리보다 작다면(점점 목표에 가까워지고 있다면), 현재 거리를 최소 거리로 지정하고, 이 상태를 기억해둠
            if (minDistance > distance) {
                minDistance = distance;
                memento = walker.createMemento();
            }
            // 그렇지 않다면, 이전의 상태로 walker의 상태를 되돌려 놓음
            else {
                if(memento != null) {
                    walker.restoreMemento(memento);
                }
            }
        }
    }
}
