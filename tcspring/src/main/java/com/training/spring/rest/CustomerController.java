package com.training.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Customer;
import com.training.spring.middle.CustomerService;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @PostMapping("/add")
    public ResponseEntity<String> add(@Validated @RequestBody final Customer customer) {
        //        String stringLoc = "";
        //        ObjectMapper mapperLoc = new ObjectMapper();
        //        try {
        //            Customer customer1 = mapperLoc.readValue(stringLoc,
        //                                                     Customer.class);
        //        } catch (JsonMappingException e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        } catch (JsonProcessingException e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        }
        this.cs.add(null);
        return ResponseEntity.ok("Ok");
    }
}
