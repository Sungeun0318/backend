package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;
import 종합.예제6.view.BoardView;

public class BoardController {
    private BoardController() {} // [1]

    private static final BoardController instance = new BoardController();// [2]

    public static BoardController getInstance() {// [3]
        return instance;
    }

    private BoardDao bd = BoardDao.getInstance();
}
