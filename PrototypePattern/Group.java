package PrototypePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Shape, Prototype {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    private String name;

    public Group(String name) {
        this.name = name;
    }

    Group addShape(Shape shape) {
        shapeList.add(shape);
        return this;
    }

    @Override
    public Object copy() {
        Group newGroup = new Group(name);

        // 원본이 가진 모든 외형 객체에 대해 copy() 메서드로 복사를 해서
        // 새로운 그룹에 추가를 하는 부분
        Iterator<Shape> iter = shapeList.iterator();
        while(iter.hasNext()) {
            Prototype shape = (Prototype)iter.next();
            newGroup.shapeList.add((Shape)shape.copy());
        }
        return newGroup;
    }

    @Override
    // 그룹의 이름값과 함께, 그룹을 구성하는 모든 도형들에 대해서 draw() 메서드를 호출하여 결과값을 생성해 반환
    public String draw() {
       StringBuffer result = new StringBuffer(name);
       result.append("(");

       Iterator<Shape> iter = shapeList.iterator();
       while(iter.hasNext()) {
           Shape shape = iter.next();
           result.append(shape.draw());
           if (iter.hasNext()) {
               result.append(" ");
           }
       }

       result.append(")");
       return result.toString();
    }

    @Override
    // 그룹을 구성하는 모든 도형에 대해 moveOffset() 메서드를 호출
    public void moveOffset(int dx, int dy) {
        Iterator<Shape> iter = shapeList.iterator();
        while(iter.hasNext()) {
            Shape shape = iter.next();
            shape.moveOffset(dx, dy);
        }
    }
}
