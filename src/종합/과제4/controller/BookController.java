package 종합.과제4.controller;

import 종합.과제4.model.dao.BookDao;
import 종합.과제4.model.dto.BookDto;
import java.util.ArrayList;

public class BookController {
    private BookController() {}
    private static final BookController bookController = new BookController();
    public static BookController getInstance() {return bookController;}

    private BookDao BD = BookDao.getInstance();

    // 1. 도서 등록
    public boolean registerBook(String title) {
        return BD.registerBook(title);
    }

    // 2. 전체 도서 조회
    public ArrayList<BookDto> getAllBooks() {
        return BD.getAllBooks();
    }

    // 3. 도서 대출
    public boolean borrowBook(int bookIndex) {
        int loginMno = MemberController.getInstance().getLoginSession();
        return BD.borrowBook(bookIndex, loginMno);
    }

    // 4. 도서 반납


    // 5. 내 대출 목록 조회

}