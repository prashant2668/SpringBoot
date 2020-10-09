package com.test;  
  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class MainTest {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("dao");  
    int status=dao.saveEmployee(new Employee(102,"Prashant",35000));  
    System.out.println(status);  
          
          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/  
      
}  
  
}  