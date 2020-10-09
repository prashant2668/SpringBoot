package com.p1.service;

import java.util.List;

import com.p1.model.Employee;

public interface EmployeeService {

	Employee findEmployeeService(int employeId);

	boolean deleteEmployeeService(int employeeId);

	boolean updateEmployeeService(Employee employee);

	boolean addEmployeeService(Employee employee);

	List<Employee> findAllEmployeesService();

}
