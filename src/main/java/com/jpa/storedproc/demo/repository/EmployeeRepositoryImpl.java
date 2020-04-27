package com.jpa.storedproc.demo.repository;

import com.jpa.storedproc.demo.domain.Employees;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Employees> getAllEmployees() {
        StoredProcedureQuery findByYearProcedure =
                em.createNamedStoredProcedureQuery("getAllEmployees");
        return findByYearProcedure.getResultList();
    }
}