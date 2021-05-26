package com.training.spring.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService     cs;

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

        CustomerController.logger.debug("Deneme " + customer);

        CustomerController.logger.debug("Deneme {1} {2} ",
                                        customer,
                                        customer);

        if (CustomerController.logger.isDebugEnabled()) {
            CustomerController.logger.debug("[CustomerController][add]-> " + customer);
        }

        this.cs.add(null);
        return ResponseEntity.ok("Ok");
    }
}
