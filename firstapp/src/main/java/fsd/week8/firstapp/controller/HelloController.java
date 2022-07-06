package fsd.week8.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//it is ready for use by Spring MVC to handle web requests
public class HelloController {
	
	@GetMapping("/")
	public String welcome()
	{
		return "Greetings form Spring Boot!";
	}
	@GetMapping("/index")
	public String index()
	{
		return "Welcome to the index page of our application";
	}
	

}
