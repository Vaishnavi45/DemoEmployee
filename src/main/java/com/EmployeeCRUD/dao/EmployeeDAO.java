package com.EmployeeCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeCRUD.model.Employee;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer> {
	
}
