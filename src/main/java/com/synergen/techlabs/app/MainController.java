package com.synergen.techlabs.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping(path = "/")
    public String main(){
        logger.info("Successful logging");
        return "Successful request";
    }

    @PostMapping(path = "/main/employee")
    public Employee employeeM(@RequestBody Employee employee){


        logger.info(String.format("{first name : %s, last name : %s, age : %d, title : %s}"
                ,employee.getFirstName(),
                employee.getLastName(),
                employee.getAge(),
                employee.getTitle()));
        logger.info(String.format("{Company : %s, salary : %d}",employee.getCompany(), employee.getSalary()));
        
        return employee;
    }
}
