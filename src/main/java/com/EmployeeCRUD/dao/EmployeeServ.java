package com.EmployeeCRUD.dao;

import java.util.List;

import com.EmployeeCRUD.model.Employee;


public interface EmployeeServ {
	public void add(Employee emp);
	public void update(Employee emp);
	public void delete(int id);
	List<Employee> empList();

}
