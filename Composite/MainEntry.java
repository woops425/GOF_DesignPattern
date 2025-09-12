package Composite;

/*
Composite 패턴 : 객체들을 트리 구조로 구성하여, 개별 객체(단일체)와 객체들의 집합(집합체)을 동일한 방식으로
다룰 수 있게 하는 구조 디자인 패턴.
폴더 안에 파일이 있을수도 있고, 또 다른 폴더가 있을 수도 있듯, '부분-전체'의 계층 구조를 갖는 시스템을 만들 때 유용.
클라이언트(사용자) 입장에서는 대상이 단일 파일인지, 여러 파일과 폴더를 담고 있는 폴더인지를 신경쓰지 않고
똑같은 명령을 내릴 수 있음
 */
public class MainEntry {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("sa.txt", 100));
        sub1.add(new File("sb.txt", 4000));

        Folder sub2 = new Folder("sub2");
        root.add(sub2);
        sub2.add(new File("SA.txt", 250));
        sub2.add(new File("SB.txt", 340));

        root.list();
    }
}
