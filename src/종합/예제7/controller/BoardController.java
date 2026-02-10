package 종합.예제7.controller;

import 종합.예제7.model.dao.BoardDao;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;

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

    // [3] 게시물 수정 controller
    public boolean update(int bno, String bcontent) {
        boolean result = bd.update(bno, bcontent);
        return result;
    }

    // [2] 게시물 조회 controller
    public ArrayList<BoardDto> findAll() {
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
}

