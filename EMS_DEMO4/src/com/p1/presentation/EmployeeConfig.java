package com.p1.presentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.p1.dao.EmployeeMapDaoImpl;
import com.p1.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfig {
	
	@Bean
public EmployeeMapDaoImpl getDao()
{
	return new EmployeeMapDaoImpl();
}
	@Bean
	public EmployeeServiceImpl getService()
	{
		return  new EmployeeServiceImpl();
	}
	@Bean
	public EmsApp getEmp()
	{
		return new EmsApp();
	}

}
