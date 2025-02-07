package com.teja.aspect_oriented_programming.controller;

import com.teja.aspect_oriented_programming.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<String> fetchEmployees(){
        List<String> list = employeeService.fetchEmployees();
        log.info(list.toString());
        return list;
    }
}
