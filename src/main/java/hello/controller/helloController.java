package hello.controller;

import hello.model.Customer;
import hello.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomer(){

        return customerService.getCustomer();
    }

    @GetMapping("/addCustomers")
    public void addCustomers(){
        customerService.addCustomers();
    }
}
