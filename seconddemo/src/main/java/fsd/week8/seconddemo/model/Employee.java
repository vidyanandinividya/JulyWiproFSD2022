package fsd.week8.seconddemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private String firstName;
	private String lastName;
	private String emailId;
	
	
	
	

}
