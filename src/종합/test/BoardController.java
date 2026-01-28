package 종합.test;

public class BoardController {
    Board[] boards = new Board[100];

    boolean doPost(String content, String writer) {
        Board board = new Board();
        board.content = content;
        board.writer = writer;
        for (int i = 0; i < boards.length -1; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }

        }
        return false;
    }
    Board [] doGet(){
        return boards;
    }

}
