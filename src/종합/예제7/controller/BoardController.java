package 종합.예제7.controller;

import 종합.예제7.model.dao.BoardDao;

public class BoardController {
    public  BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() {return instance;}

    private BoardDao bd = BoardDao.getInstance();
    // [1] 게시물 등록 controller
    public boolean write(String bcontent, String bwrite) {
        boolean result = bd.write(bcontent, bwrite);
        return result;
    }

    // [2] 게시물 삭제 controller
    public boolean delete(int bno) {
        boolean result = bd.delete(bno);
        return result;
    }
}
