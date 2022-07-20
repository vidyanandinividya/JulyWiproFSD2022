package fsd.week9.springsecuritywebdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	@GetMapping("index")
	public String index()
	{
		return "admin/index";
	}

}
