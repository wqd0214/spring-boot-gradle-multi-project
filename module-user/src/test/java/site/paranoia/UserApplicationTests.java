package site.paranoia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.user.UserApplication;
import site.paranoia.user.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class UserApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        userService.addUser();
    }

}
