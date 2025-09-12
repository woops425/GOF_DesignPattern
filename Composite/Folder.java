package Composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit{
    private LinkedList<Unit> unitList = new LinkedList<Unit>();

    public Folder(String name) {
        super(name);
    }

    // 자신이 포함하고 있는 모든 파일 및 폴더의 용량을 합해서 반환해야 함
    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> it = unitList.iterator();

        // 자신이 포함하고 있는 모든 항목 순회. 각 항목의 용량을 얻는 getSize()의 반환값을 누적.
        while (it.hasNext()) {
            Unit unit = it.next();
            size += unit.getSize();
        }

        // 최종값 반환
        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    // 자기 자신을 다시 호출하는 재귀 구문으로 구성. Composite 패턴은 집합체와 단일체를 동일한 개념으로 처리하기 때문에 재귀 구문이 필요한 부분이 많음
    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder)unit;
            Iterator<Unit> it = dir.unitList.iterator();
            System.out.println(indent + "+ " + unit);
            while (it.hasNext()) {
                list(indent + "     ", it.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
}
