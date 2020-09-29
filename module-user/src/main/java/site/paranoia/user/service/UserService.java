package site.paranoia.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.paranoia.user.domain.User;
import site.paranoia.user.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser() {
        User user = new User();
        user.setName("21121212");
        user.setAge(12);
        user.setEmail("122222");
        user.setDeleteFlag(0);
        userMapper.insertSelective(user);
    }
}
