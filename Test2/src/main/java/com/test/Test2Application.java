package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Department;
import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;

@SpringBootApplication
public class Test2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Test2Application.class, args);
	
	EmployeeRepository empRepo= context.getBean(EmployeeRepository.class);
	
	
	Department department= new Department();
	department.setDName("HR");
	department.setLocation("Bangalore");
	
	Department department2= new Department();
	department2.setDName("TL");
	department2.setLocation("AP");
	
	Department department3= new Department();
	department3.setDName("Manager");
	department3.setLocation("MP");

	
	List<Department> depList1=Arrays.asList(department,department2);
	List<Department> depList2=Arrays.asList(department3);
	Employee employee= new Employee();
	
	employee.setEName("Adil");
	employee.setDesignation(depList1);

	
	department.setEmp(employee);
	department2.setEmp(employee);
	empRepo.save(employee);
	
  Employee employee2= new Employee();
	
	employee2.setEName("Manoj");
	employee2.setDesignation(depList2);
	department3.setEmp(employee2);
	empRepo.save(employee2);
	
	System.out.println("DAta saved successfully");
	//get data
	//empRepo.findById(1);
	
	System.out.println(empRepo.findById(1));
	
	
	}

}
