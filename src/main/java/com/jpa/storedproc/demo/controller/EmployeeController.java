package com.jpa.storedproc.demo.controller;


import com.jpa.storedproc.demo.domain.Employees;
import com.jpa.storedproc.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Employees>> getAllEmployees() {

        Iterable<Employees> employees = employeeRepository.getAllEmployees();

        List<Employees> target = new ArrayList<>();
        employees.forEach(target::add);
        return new ResponseEntity<>(target, HttpStatus.OK);

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employees> getAllEmployeeById(@PathVariable(name = "id") long id) {

        Employees one = employeeRepository.getOne(id);
        return new ResponseEntity<>(one, HttpStatus.OK);
    }
}