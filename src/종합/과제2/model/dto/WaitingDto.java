package 종합.과제2.model.dto;

public class WaitingDto {
    private int no;
    private String phone;
    private int count;

    public WaitingDto(){}
    public WaitingDto(int no, String phone, int count) {
        this.no = no;
        this.phone = phone;
        this.count = count;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }

}
