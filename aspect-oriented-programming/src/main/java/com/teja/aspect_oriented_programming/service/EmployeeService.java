package com.teja.aspect_oriented_programming.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    public List<String> fetchEmployees(){
        return List.of("test","test2","test3");
    }
}
