package 종합.예제5;

public class Board {
    // 1. 멤버변수
    private String content;
    private String writer; // 현재 클래스에서만 접근 허용

    // 2. 생성자
    public Board(){}
    public Board(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    // 3. 메소드
        // 1. getter and setter

    public String getContent() {
        return content;
    }
    public void setContent(String content) {}

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {}

        // 2. toString

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
