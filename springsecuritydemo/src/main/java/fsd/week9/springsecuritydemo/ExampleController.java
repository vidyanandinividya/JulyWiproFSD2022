package fsd.week9.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/")
	public String index()
	{
		return "Spring Security Demo";
	}

}
