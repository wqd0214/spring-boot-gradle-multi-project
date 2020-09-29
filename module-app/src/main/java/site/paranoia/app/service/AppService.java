package site.paranoia.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.app.domain.User;
import site.paranoia.app.mapper.AppMapper;

public class AppService {

    @Autowired
    AppMapper appMapper;

    public void addUser() {
        User user = new User();
        user.setName("21121212");
    }
}
