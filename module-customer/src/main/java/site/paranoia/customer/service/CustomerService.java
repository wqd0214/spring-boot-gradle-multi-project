package site.paranoia.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.paranoia.customer.domain.Customer;
import site.paranoia.customer.mapper.CustomerMapper;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public void addUser() {
        Customer user = new Customer();
        user.setName("21121212");
        user.setAge(12);
        user.setEmail("122222");
        customerMapper.insertSelective(user);
    }
}
