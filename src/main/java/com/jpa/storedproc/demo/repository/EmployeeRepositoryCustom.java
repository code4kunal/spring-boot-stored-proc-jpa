package com.jpa.storedproc.demo.repository;


import com.jpa.storedproc.demo.domain.Employees;

import java.util.List;

public interface EmployeeRepositoryCustom {

    List<Employees> getAllEmployees();
}