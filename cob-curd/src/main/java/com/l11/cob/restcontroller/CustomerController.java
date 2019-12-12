package com.l11.cob.restcontroller;

import com.l11.cob.model.Customer;
import com.l11.cob.repository.CoustomerRepository;
import com.l11.cob.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/l11")
public class CustomerController {

    @Autowired
    CustomerServices customerServices;

    @PostMapping(value = "/customer")
    public String addACustomer(@RequestBody Customer customer){
        customerServices.addCustomer(customer);
        return "customer added";
    }

    @GetMapping("/customer")
    public Iterable<Customer> getAllCustomer(){
        return customerServices.fetchAllCustomer();
    }

    @DeleteMapping("/customer")
    public String deleteACustomer(@RequestParam("id") Integer id){
        Optional<Customer> customer = customerServices.findById(id);
        //System.out.println("customer::::::"+customer);
        if (!customer.isEmpty()){
            customerServices.delete(id);
            return "Customer with ID: ["+id+"]"+" Deleted";
        }
        else
            return "Customer with ID: ["+id+"]"+" Not Found";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomerByNames(@RequestParam("name") String name){
        System.out.println("name::::::"+name);
        return customerServices.findByName(name);
    }
}
