package wiprofsd.week8.inmemorydbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiprofsd.week8.inmemorydbdemo.entity.Employee;
import wiprofsd.week8.inmemorydbdemo.repository.EmployeeRepository;

@Service
public class EmployeeReadService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}

}
