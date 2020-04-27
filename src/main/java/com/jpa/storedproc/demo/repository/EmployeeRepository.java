package com.jpa.storedproc.demo.repository;


import com.jpa.storedproc.demo.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long>, EmployeeRepositoryCustom {


}