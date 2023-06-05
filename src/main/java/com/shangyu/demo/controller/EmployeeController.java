package com.shangyu.demo.controller;

import com.shangyu.demo.entity.Employee;
import com.shangyu.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/demo")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping(path="/all")
    @ResponseBody
    public List<Employee> getAllUsers() {
        return employeeService.findAll();

    }
}
