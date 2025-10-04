package MemetoMethod;

import java.util.ArrayList;

public class Walker {
    private int currentX, currentY;
    // 도달 해야 할 목표 좌표
    private int targetX, targetY;
    // 시작 좌표에서, 목표 좌표로 도달하기까지 어떤 액션을 취해야 하는지 순서대로 저장하기 위한 배열객체
    private ArrayList<String> actionList = new ArrayList<String>();

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(String action) {
        actionList.add(action);

        if (action.equals("UP")) {
            currentY += 1;
        } else if (action.equals("RIGHT")) {
            currentX += 1;
        } else if (action.equals("DOWN")) {
            currentY -= 1;
        } else if (action.equals("LEFT")) {
            currentX -= 1;
        }

        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    public Memento createMemento() {
        Memento memento = new Memento();

        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<String>) this.actionList.clone();

        return memento;
    }

    // 객체의 상태를 기억해 두었다가, 필요할 때 기억해둔 상태로 객체를 되돌려주는 메소드
    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (ArrayList<String>) memento.actionList.clone();
    }

    public class Memento {
        private int x, y;
        private ArrayList<String> actionList;
        private Memento() {}

        @Override
        public String toString() {
            return actionList.toString();
        }
    }
}
