package com.p1.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.p1.model.Employee;
import com.p1.service.EmployeeService;

public class EmsApp {

	private EmployeeService employeeService;

	public EmsApp() {
		System.out.println("EmsApp default constructor created...");
	}
//constr
	public EmsApp(EmployeeService employeeService) {
		System.out.println("EmsApp param constructor created...");
		this.employeeService = employeeService;
	}
//setter
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

		// create a spring container
				ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
				System.out.println("====== spring container created. ===========");

				// EmsApp e=c.getBean(EmsApp.class);
				EmsApp e = (EmsApp) c.getBean("emsApp");
			

				
				
				
				e.showAllEmployees();
				
				//close the container
				((ClassPathXmlApplicationContext)c).registerShutdownHook();
					

	}

}







