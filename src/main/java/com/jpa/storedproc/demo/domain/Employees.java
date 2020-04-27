package com.jpa.storedproc.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllEmployees",
                procedureName = "get_all_employees",
                resultClasses = Employees.class)
})
public class Employees implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeID")
    private long employeeID;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "address")
    private String address;
}