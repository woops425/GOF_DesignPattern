package PrototypePattern;

public class Line implements Shape, Prototype {
    private Point startPt;
    private Point endPt;

    public Line setStartPoint(Point pt) {
        this.startPt = pt;
        return this;
    }

    public Line setEndPoint(Point pt) {
        this.endPt = pt;
        return this;
    }

    public Point getStartPoint() {
        return startPt;
    }

    public Point getEndPtoint() {
        return endPt;
    }

    @Override
    // 객체를 구성하는 시작점과 끝점을 지정.
    // 이 때, 프로토타입 인터페이스의 copy() 메서드를 사용하는데, 이는 복사본 객체와 원본 객체의 필드값들이
    // 서로 다른 메모리 상에 위치하도록 복사 됨. 이는 복사본의 시작점과 끝점의 좌표를 변경해도 원본의 시작점이나 끝점이 변경되지 않도록 함.
    // 반대로, 원본의 시작점이나 끝점의 좌표를 변경해도 복사본의 시작점이나 끝점의 좌표가 변경되지 않도록 함.
    public Object copy() {
        Line newLine = new Line();

        newLine.startPt = (Point)startPt.copy();
        newLine.endPt = (Point)endPt.copy();

        return newLine;
    }

    @Override
    public String draw() {
        return "LINE(" + startPt.draw() + "," + endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        startPt.moveOffset(dx, dy);
        endPt.moveOffset(dx, dy);
    }
}
