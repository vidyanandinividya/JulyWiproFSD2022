package fsd.week8.seconddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fsd.week8.seconddemo.model.Employee;

//@Controller
@RestController
public class EmployeeController {
	@GetMapping("/employee")
	//@ResponseBody
	public Employee get()
	{
		Employee e1=new Employee();
		e1.setFirstName("John");
		e1.setLastName("Smith");
		e1.setEmailId("john@gmail.com");
		return e1;
	}
	@GetMapping("/")
	//@ResponseBody
	public Employee getDefaultEmployee()
	{
		/*Employee e1=new Employee();
		e1.setFirstName("Lily");
		e1.setLastName("Smith");
		e1.setEmailId("lily@gmail.com");*/
		Employee e1=Employee.builder().firstName("Hary").lastName("Porter")
				.build();
		return e1;
	}
	@PostMapping("employeeinfo")
	public Employee employeeinfo(String firstName,String lastName,String emailId)
	{
		Employee emp=new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmailId(emailId);
		return emp;
	}

}
