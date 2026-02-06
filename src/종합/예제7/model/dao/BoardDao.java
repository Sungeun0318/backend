package 종합.예제7.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    private BoardDao(){connect();}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance;}

    // =========== 데이터베이스 연동 =========== //
        // 1) 연동할 db서버의 정보
    private String url = "jdbc:mysql://localhost:3306/boardservice7";
    private String username = "root"; private String password = "1208";
        // 2) 연동 인터페이스 선언
    private Connection conn;
        // 3) 연동 함수 선언, dao에 생성자에서 함수 실행 (dao 싱글톤이 생성되면서 db연동이 실행)
    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 라이브러리 객체 메모리할당/불러오기
            conn = DriverManager.getConnection(url, username, password); // mysql 구현체로 db연동 후 연동 인터페이스에 반환
            System.out.println("[준비] 데이터베이스 연동 성공");
        }catch(Exception e){
            System.out.println("[경고] 데이터베이스 연동 실패 : 관리자에게 문의");
        }
    }

    // [1] 게시물 등록 dao
    public boolean write(String bcontent, String bwriter){
        // 1) sql 작성한다. 저장 -> C -> insert
        try {
            String sql = "insert into board(bcontent, bwriter) values(?, ?)";
            // 2) 연동된(conn) 인터페이스에 내가 작성한 SQL 기재한다. 반환 preparedStatement 준비된 * 일반예외
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3) SQL 기재된(ps) 인터페이스에 매개변수 대입
            ps.setString(1, bcontent); // String 타입으로 SQL내 1번 ?에 bcontent값 대입한다.
            ps.setString(2, bwriter); // String 타입으로 SQL내 2번 ?에 bwriter값 대입힌다.
            // 4) 매개변수까지 대입하여 준비가 끝났으면 SQL 실행, ps.executeUpdate(); 반환값은 반영된 레코드수
            int count = ps.executeUpdate();
            // 5) SQL 실행 후 반영된 레코드 수에 따른 결과제어
            if (count == 1) {return true;} // 등록한 레코드 수가 1이면 등록성공
            else {return false;} // 아니면 실패

        } catch (SQLException e){
            System.out.println("[시스템오류] SQL 문법 문제 발생 : " + e);
        }
        return false; // 실패
    }

    // [4] 게시물 삭제 dao
    public boolean delete(int bno) {
        boolean result = false;
        try {
            // 1] SQL 작성한다. ? 는 매개변수 값이 들어갈 자리
            String sql = "delete from board where bno = ?";
            // 2] 연동된[conn]인터페이스에 SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3] ?와일드카드에 매개변수 대입, ps.setxxx(?순서번호, 값);
            ps.setInt(1, bno);
            // 4] SQL 실행한다. , 실행 후 반영된 레코드 수
            int count = ps.executeUpdate();
            // 5] 결과
            if (count == 1) {return true;} // 삭제된 레코드수 1개 이면 성공
            else {return false;} // 실패
        }catch (SQLException e){
            System.out.println("[시스템오류] SQL 문법 문제 발생 : " + e);
        }
        return false; // 실패
    }



} // c e
