package 종합.과제3.model.dto;

public class UserDto {
    private int userNo;
    private String id;
    private String pw;
    private String nickname;
    private String phone;

    public UserDto() {
    }

    public UserDto(int userNo, String id, String pw, String nickname, String phone) {
        this.userNo = userNo;
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
        this.phone = phone;
    }

    public int getUserNo() {
        return userNo;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userNo=" + userNo +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}