package 종합.과제4.model.dto;

public class MemberDto {
    private int mno;
    private String id;
    private String pw;
    private String nickname;

    public MemberDto() {}

    public MemberDto(int mno, String id, String pw, String nickname) {
        this.mno = mno;
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", id='" + id + "'" +
                ", pw='" + pw + "'" +
                ", nickname='" + nickname + "'" +
                '}';
    }
}