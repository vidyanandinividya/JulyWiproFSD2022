package wiprofsd.week8.inmemorydbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import wiprofsd.week8.inmemorydbdemo.service.EmployeeReadService;

@SpringBootApplication
@Slf4j
public class InmemorydbdemoApplication implements CommandLineRunner{

	@Autowired
	EmployeeReadService employeeReadService;
	public static void main(String[] args) {
		SpringApplication.run(InmemorydbdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Fetch all Employees ->{}",employeeReadService.getAllEmployees());
		
	}

}
