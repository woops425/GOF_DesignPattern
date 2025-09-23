package Observer;

public class MainEntry {
    /* 객체의 상태 변화를 관찰하는 '관찰자(Observer)'들, 즉 옵서버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해
    객체가 직접 '통보(notify)'하도록 하는 디자인 패턴. 이 패턴은 주로 한 객체의 상태가 바뀌면 다른 객체들에게도 변경 내용이 전달되어야 하고,
    이들 사이의 의존성을 최소화하고 싶을 때 사용.

    ex) 유튜브 구독, 알림 시스템
    유튜버 (Subject): 새로운 영상을 올리면 (상태 변경)
    구독자 (Observers): 알림을 받습니다 (상태 업데이트)
     */
    public static void main(String[] args) {
        DiceGame diceGame = new FairDiceGame();

        Player player1 = new EvenBettingPlayer("짝궁댕이");
        Player player2 = new OddBettingPlayer("홀아비");
        Player player3 = new OddBettingPlayer("홀쭉이");

        diceGame.addPlayer(player1);
        diceGame.addPlayer(player2);
        diceGame.addPlayer(player3);

        for (int i=0; i<5; i++) {
            diceGame.play();
            System.out.println();
        }
    }
}
