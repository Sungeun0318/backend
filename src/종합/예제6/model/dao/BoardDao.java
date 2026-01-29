package 종합.예제6.model.dao;

import 종합.예제6.view.BoardView;

public class BoardDao {
    private BoardDao() {} // [1]

    private static final BoardDao instance = new BoardDao();// [2]

    public static BoardDao getInstance() {// [3]
        return instance;
    }
}
