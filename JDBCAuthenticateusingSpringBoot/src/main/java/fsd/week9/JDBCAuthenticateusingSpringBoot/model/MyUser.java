package fsd.week9.JDBCAuthenticateusingSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyUser {
	private String userName;
	private String password;
	private String roles;

}
