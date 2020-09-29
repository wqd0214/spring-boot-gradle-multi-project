package site.paranoia.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/app")
public class AppController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String getTest() {
        return customerService.testCustomer();
    }
}
