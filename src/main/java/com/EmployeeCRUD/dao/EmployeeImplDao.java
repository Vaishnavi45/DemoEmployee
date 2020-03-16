package com.EmployeeCRUD.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeCRUD.model.Employee;

@Service
public class EmployeeImplDao implements EmployeeServ {

	@Autowired
	public void add(Employee emp) {
		EmployeeDAO empd=(EmployeeDAO) new EmployeeImplDao();
		empd.save(emp);
		
	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> empList() {
		// TODO Auto-generated method stub
		return null;
	}



}
