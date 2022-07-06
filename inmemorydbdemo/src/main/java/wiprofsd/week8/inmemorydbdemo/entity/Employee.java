package wiprofsd.week8.inmemorydbdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;

}
