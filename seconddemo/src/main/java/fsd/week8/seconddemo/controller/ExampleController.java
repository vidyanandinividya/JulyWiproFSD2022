package fsd.week8.seconddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/index")
	public String index()
	{
		return "Example Controller";
	}

}
