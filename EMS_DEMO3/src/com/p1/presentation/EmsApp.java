package com.p1.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.p1.model.Employee;
import com.p1.service.EmployeeService;
@Component
public class EmsApp {
@Autowired
	private EmployeeService employeeService;

	public EmsApp() {
		System.out.println("EmsApp default constructor created...");
	}

	public EmsApp(EmployeeService employeeService) {
		System.out.println("EmsApp param constructor created...");
		this.employeeService = employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
		System.out.println("EmsApp setEmployeeService...");
	}

	public void addEmployee(Employee employee) {

		if (employeeService.addEmployeeService(employee))
			System.out.println("Employee added succsfully....");
		else
			System.out.println("Prodble in adding employee");

	}

	public void updateEmployee(Employee employee) {

		if (employeeService.updateEmployeeService(employee))
			System.out.println("Employee update succsfully....");
		else
			System.out.println("employee doesn't exist");

	}

	public void deleteEmployee(int employeeId) {

		if (employeeService.deleteEmployeeService(employeeId))
			System.out.println("Employee deletedsuccsfully....");
		else
			System.out.println("employee doesn't exist");

	}

	public void showEmployee(int employeeId) {
		Employee employee = employeeService.findEmployeeService(employeeId);

		if (employee != null)
			System.out.println("Employee Details.\n\n" + employee);
		else
			System.out.println("employee doesn't exist");

	}

	public void showAllEmployees() {
		System.out.println("Employee Details.\n\n");

		for (Employee e : employeeService.findAllEmployeesService())
			System.out.println(e);

	}

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("====== spring container created. ===========");

		EmsApp e=(EmsApp)c.getBean("emsApp");
		
		e.showAllEmployees();
		
		//close the container
		((ClassPathXmlApplicationContext)c).registerShutdownHook();
			


	}

}







