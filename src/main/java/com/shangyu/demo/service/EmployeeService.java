package com.shangyu.demo.service;

import com.shangyu.demo.entity.Employee;
import com.shangyu.demo.mapper.employeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    com.shangyu.demo.mapper.employeeMapper employeeMapper;

    public List<Employee> findAll() {
        return null;
    }
}
