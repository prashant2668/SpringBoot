package com.p1.dao;

import java.util.ArrayList;
import java.util.List;

import com.p1.Data.EmployeeMap;
import com.p1.model.Employee;


public class EmployeeMapDaoImpl implements EmployeeDao {

	public EmployeeMapDaoImpl() {
		System.out.println("EmployeeMapDaoImpl default constructor created....");
	}

	@Override
	public boolean addEmployee(Employee employee) {

		return EmployeeMap.INSTANCE.getMap().put(employee.getEmployeeId(), employee) == employee;
	}

	@Override
	public Employee findEmployee(int employeId) {

		return EmployeeMap.INSTANCE.getMap().get(employeId);

	}

	@Override
	public boolean deleteEmployee(int employeeId) {

		if (EmployeeMap.INSTANCE.getMap().containsKey(employeeId)) {
			EmployeeMap.INSTANCE.getMap().remove(employeeId);
			return true;
		}
		return false;

	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if (EmployeeMap.INSTANCE.getMap().containsKey(employee.getEmployeeId())) {
			EmployeeMap.INSTANCE.getMap().put(employee.getEmployeeId(), employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return new ArrayList<>(EmployeeMap.INSTANCE.getMap().values());
	}

}
