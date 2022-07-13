package fsd.week9.ItemCatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Item {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	public Item(String name) {
		super();
		this.name = name;
	}
	
	

}
