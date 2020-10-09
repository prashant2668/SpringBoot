package com.p1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.p1.dao.EmployeeDao;
import com.p1.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	// dependency
	@Autowired
	@Qualifier("EmployeeMapDaoImpl")
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl created.,.....");
	}

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("EmployeeServiceImpl param constrcutor created...,.....");

	}

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
