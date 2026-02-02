package 종합.과제4.model.dao;

import 종합.과제4.model.dto.BookDto;
import java.util.ArrayList;

public class BookDao {
    private static BookDao instance = new BookDao();
    private ArrayList<BookDto> books = new ArrayList<>();

    private int currentBno = 0;

    private BookDao() {
    }
    public static BookDao getInstance() {
        return instance;
    }

    // 1. 도서 등록
    public boolean registerBook(String title) {
        currentBno++;
        books.add(new BookDto(currentBno, title));
        return true;
    }

    // 2. 전체 도서 조회
    public ArrayList<BookDto> getAllBooks() {
        return books;
    }

    // 3. 도서 대출
    public boolean borrowBook(int bookIndex, int memberMno) {
        if (bookIndex < 0 || bookIndex >= books.size()) {
            return false;
        }
        BookDto book = books.get(bookIndex);
        if (book.isBorrowed()) {
            return false;
        }
        book.setBorrowed(true);
        book.setBorrowerMno(memberMno);
        return true;
    }

    // 4. 도서 반납


    // 5. 내가 대출 중인 도서 조회

}
