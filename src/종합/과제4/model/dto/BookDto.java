package 종합.과제4.model.dto;

public class BookDto {
    private int bno;
    private String title;
    private int borrowerMno;
    private boolean isBorrowed;

    public BookDto() {
    }

    public BookDto(int bno, String title) {
        this.bno = bno;
        this.title = title;
        this.borrowerMno = -1;
        this.isBorrowed = false;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBorrowerMno() {
        return borrowerMno;
    }

    public void setBorrowerMno(int borrowerMno) {
        this.borrowerMno = borrowerMno;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bno=" + bno +
                ", title='" + title + "'" + 
                ", borrowerMno=" + borrowerMno +
                ", isBorrowed=" + isBorrowed +
                "    }";
    }
}