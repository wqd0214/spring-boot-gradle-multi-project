package site.paranoia.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.user.domain.User;
import site.paranoia.user.mapper.UserMapper;

public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser() {
        User user = new User();
        user.setName("21121212");
    }
}
