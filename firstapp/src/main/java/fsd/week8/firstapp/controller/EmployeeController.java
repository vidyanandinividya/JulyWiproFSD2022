package fsd.week8.firstapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fsd.week8.firstapp.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployee()
	{
		Employee e1=new Employee("John","Smith");
		Employee e2=new Employee("John1","Smith1");
		Employee e3=new Employee("John2","Smith2");
		Employee e4=new Employee("John3","Smith3");
		Employee e5=new Employee("John4","Smith4");
		List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5);
		return emp;
	}

}
