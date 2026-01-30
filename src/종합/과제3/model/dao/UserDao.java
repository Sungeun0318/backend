package 종합.과제3.model.dao;

import 종합.과제3.model.dto.UserDto;

import java.util.ArrayList;

public class UserDao {
    private UserDao() {}
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance() {
        return instance;
    }

    private final ArrayList<UserDto> userList = new ArrayList<UserDto>();

    public int login(String id, String pw){
        for (UserDto userDto : userList){
            if (id.equals(userDto.getId())&&pw.equals(userDto.getPw())){
                return userDto.getUserNo();
            }
        }
        return 0;
    }

    private static int currentUserNo =1;
    public boolean singin(String id, String pw, String nickname, String phone){
        UserDto userDto = new UserDto(currentUserNo, id, pw, nickname, phone);
        boolean result = userList.add(userDto);
        currentUserNo++;
        return result;
    }
}
