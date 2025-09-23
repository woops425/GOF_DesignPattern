package Observer;

import java.util.LinkedList;

public abstract class DiceGame {
    // protected로 지정하여 자식 클래스에서도 이 필드에 접근할 수 있도록 함
    protected LinkedList<Player> playerList = new LinkedList<Player>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public abstract void play();
}
