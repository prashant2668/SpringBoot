package com.p1.service;

import java.util.List;

import com.p1.dao.EmployeeDao;
import com.p1.model.Employee;



public class EmployeeServiceImpl implements EmployeeService {

	// dependency
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl created.,.....");
	}
//constr injection
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("EmployeeServiceImpl param constrcutor created...,.....");

	}
//setter injection
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("EmployeeServiceImpl setEmployeeDao method..,.....");

	}

	@Override
	public Employee findEmployeeService(int employeId) {
		// TODO Auto-generated method stub
		return employeeDao.findEmployee(employeId);
	}

	@Override
	public boolean deleteEmployeeService(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public boolean updateEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public boolean addEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> findAllEmployeesService() {
		// TODO Auto-generated method stub
		return employeeDao.findAllEmployees();
	}

}
