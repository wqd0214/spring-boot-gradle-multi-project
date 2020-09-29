package site.paranoia.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class UserTest {

    @PostConstruct
    public void init() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译UserTest开始>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译UserTest结束>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
