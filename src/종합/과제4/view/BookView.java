package 종합.과제4.view;

import 종합.과제4.controller.BookController;
import 종합.과제4.controller.MemberController;
import 종합.과제4.model.dto.BookDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    private BookView() {
    }

    private static final BookView instance = new BookView();

    public static BookView getInstance() {
        return instance;
    }

    private BookController BC = BookController.getInstance();
    private MemberController MC = MemberController.getInstance();
    private Scanner sc = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            System.out.println("\n===== 로그인 후 메뉴 =====");
            int loginMno = MC.getLoginSession();
            if (loginMno == 1) {
                System.out.println("1. 도서 대출 | 2. 도서 등록 | 3. 도서 반납 | 4. 전체 도서 조회 | 5. 내 대출 도서 | 6. 로그아웃");
            } else {
                System.out.println("1. 도서 대출 | 2. 도서 반납 | 3. 전체 도서 조회 | 4. 내 대출 도서 | 5. 로그아웃");
            }

            System.out.print("선택 > ");
            try {
                int ch = sc.nextInt();
                // 관리자 메뉴
                if (loginMno == 1) {
                    if (ch == 1) {
                        borrowBook();
                    } else if (ch == 2) {
                        registerBook();
                    } else if (ch == 3) {
                        returnBook();
                    } else if (ch == 4) {
                        showAllBooks();
                    } else if (ch == 5) {
                        showMyBooks();
                    } else if (ch == 6) {
                        MC.logout();
                        break;
                    }
                }
                // 일반 회원 메뉴
                else {
                    if (ch == 1) {
                        borrowBook();
                    } else if (ch == 2) {
                        returnBook();
                    } else if (ch == 3) {
                        showAllBooks();
                    } else if (ch == 4) {
                        showMyBooks();
                    } else if (ch == 5) {
                        MC.logout();
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
    }

    public void registerBook() {
        System.out.println("\n===== 도서 등록 =====");
        System.out.print("등록 할 도서 이름 : ");
        String title = sc.next();
        boolean result = BC.registerBook(title);
        if (result) {
            System.out.println("[안내] 도서가 등록 되었습니다.");
        } else {
            System.out.println("제품 등록 실패");
        }
    }

    public void showAllBooks() {
        ArrayList<BookDto> list = BC.getAllBooks();
        sc.nextLine();
        System.out.println("===== 전체 도서 조회 ======");
        for (int i = 0; i < list.size(); i++) {
            BookDto b = list.get(i);
            String status = b.isBorrowed() ? "[대출 중]" : "[대출 가능]";
            System.out.printf("%d. %s %s\n", (i + 1), b.getTitle(), status);
        }
    }


    public void borrowBook() {
        ArrayList<BookDto> list = BC.getAllBooks();
        sc.nextLine();
        System.out.println("===== 도서 대출(현재 대출 할 수 있는 도서) =====");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isBorrowed()) {
                System.out.printf("%d. %s\n", (i + 1), list.get(i).getTitle());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("대출 가능한 도서가 없습니다.");
            return;
        }
        System.out.print("선택 > ");
        int bIndex = sc.nextInt() - 1;
        if (BC.borrowBook(bIndex)) {
            System.out.println("[안내] 해당 도서가 대출되었습니다.");
        } else {
            System.out.println("[안내] 대출 실패");
        }
    }

    public void returnBook() {

    }

    public void showMyBooks() {

    }
}