package FacadePattern;

import java.util.HashMap;

public class DBMS {
    // HashMap(key, value). key는 Row 클래스 객체의 이름 필드에 해당됨.
    private HashMap<String, Row> db = new HashMap<String, Row>();

    public DBMS() {
        db.put("jane", new Row("Jane", "1990-02-14", "jane09@geosee.co.kr"));
        db.put("robert", new Row("robert", "1979-11-15", "nice@google.com"));
        db.put("sangwoo", new Row("Sangwoo", "2001-04-25", "tttyyy06@naver.ocm"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
