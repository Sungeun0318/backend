package 종합.예제5;

public class BoardController {

    // [1] private : 외부접근차단, static : 우선할당(객체없이), final(수정금지) board = x, boards[0] = o
    private  static final Board[] boards = new Board[100];

    // [2] 기능1 : 저장 기능, public : 모든 프로젝트에서 호출 가능 뜻
    public static boolean doPost(String content, String writer){
        Board board = new Board(content, writer); // 1. 생성자를 이용한 객체 생성

        // 2.
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }
        }
        return false;
    }

    // [3] 기능2 : 조회 기능
    public static Board[] doGet(){
        return boards;
    }

}
