package site.paranoia.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class CustomerTest {

    @PostConstruct
    public void init() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译CustomerTest开始>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>编译CustomerTest结束>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
