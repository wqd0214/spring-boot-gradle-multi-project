package site.paranoia;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.customer.domain.User;
import site.paranoia.customer.mapper.CustomerMapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    CustomerMapper customerMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = customerMapper.selectAll();
        Assert.assertEquals(6, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("wqd1994");
        user.setEmail("wqd_1994@163.com");
        user.setAge(22);
        customerMapper.insert(user);
        System.out.println(user.getId());
    }

    @Test
    public void deleteUser() {
        User user = new User();
        int result = customerMapper.delete(user);
        System.out.println(result);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        User user = new User();
        user.setId(10);
        user.setName("2921212");
        int result = customerMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(10);
        user.setName("2921212");
        int result = customerMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }
}
