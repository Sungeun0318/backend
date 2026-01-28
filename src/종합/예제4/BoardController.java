package 종합.예제4;

// - 게시물 기능 설계클래스
public class BoardController {
    // 속성 : 멤버변수
    Board[] boards = new Board[100];

    // 기능 : 메소드
    boolean doPost(String content, String writer) {
        Board board = new Board(); // 1. 객체 생성
        board.content = content;   // 2. 매개변수로 받은 값을 객체 대입
        board.writer = writer;
        for (int i = 0; i < boards.length - 1; i++) {
            if (boards[i] == null) { // 3. 만약에 i번째 요소가 비어있으면
                boards[i] = board; // 배열에 새로운 객체 저장
                return true; // 함수종료 뜻, true 반환 했으므로 리턴타입은 boolean

            }
        }
        return false; // for문 끝났음에도 저장 못했으면 false 반환
    }

    Board[] doGet() {
        return boards; // boards 반환 했으므로 리턴타입은 boards 변수의 타입은 Board[] 배열이다.
    }
}
