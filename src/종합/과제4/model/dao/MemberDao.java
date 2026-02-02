package 종합.과제4.model.dao;

import 종합.과제4.model.dto.MemberDto;
import java.util.ArrayList;

public class MemberDao {
    private static MemberDao instance = new MemberDao();
    private ArrayList<MemberDto> members = new ArrayList<>();

    private int currentMno = 0;

    private MemberDao() {
        // 관리자 아이디디디ㅣ
        currentMno++;
        members.add(new MemberDto(currentMno, "admin", "1234", "관리자"));
    }
    public static MemberDao getInstance() {
        return instance;
    }

    // 1. 회원가입
    public boolean signup(MemberDto memberDto) {
        currentMno++;
        memberDto.setMno(currentMno);
        members.add(memberDto);
        return true;
    }

    // 2. 로그인
    public MemberDto login(String id, String pw) {
        for (MemberDto member : members) {
            if (member.getId().equals(id) && member.getPw().equals(pw)) {
                return member;
            }
        }
        return null;
    }
}
