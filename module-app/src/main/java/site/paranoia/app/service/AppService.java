package site.paranoia.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.app.domain.App;
import site.paranoia.app.mapper.AppMapper;

public class AppService {

    @Autowired
    AppMapper appMapper;

    public void addUser() {
        App app = new App();
        app.setName("21121212");
    }
}
