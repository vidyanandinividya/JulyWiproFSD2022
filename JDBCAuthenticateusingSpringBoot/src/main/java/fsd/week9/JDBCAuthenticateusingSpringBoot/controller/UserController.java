package fsd.week9.JDBCAuthenticateusingSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsd.week9.JDBCAuthenticateusingSpringBoot.model.MyUser;

@RestController
public class UserController {
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping(value="/register-user")
	public String register(@RequestBody MyUser myUser)
	{
		List<GrantedAuthority> authorities=new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myUser.getRoles()));
		String encoddedPassword=passwordEncoder.encode(myUser.getPassword());
		User user=new User(myUser.getUserName(), encoddedPassword, authorities);
		jdbcUserDetailsManager.createUser(user);
		return "user created";
	}
	@GetMapping(value="/admin")
	public String admin()
	{
		return "<h3>Welcome Admin</h3>";
		
	}
	@GetMapping(value="/user")
	public String user()
	{
		return "<h3>Hello User</h3>";
		
	}
	@GetMapping(value="/")
	public String welcome()
	{
		return "<h3>Welcome Everyone</h3>";
		
	}


}
