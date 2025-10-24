package ChainOfResponsibility;
/*
    요청을 보내는 객체와 요청을 처리하는 객체 간의 결합을 느슨하게 만드는 행동 디자인 패턴.
    요청을 처리할 수 있는 여러 객체를 '책임 사슬(Chain)'로 연결하고, 요청이 이 사슬을 따라 이동하면서 자신을 처리할 객체를 만날 때까지 전달됨
    요청을 보낸 클라이언트는 사슬의 구조를 알 필요가 없으며, 어떤 객체가 이 요청을 최종적으로 처리했는지 알 필요가 없음
*/
public class MainEntry {
    public static void main(String[] args) {
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new PortHandler();
        Handler handler3 = new DomainHandler();

        handler1.setNext(handler2).setNext(handler3);

        String url = "http://www.youtube.com:1007";
        System.out.println("INPUT: " + url);

        handler1.run(url);
    }
}
