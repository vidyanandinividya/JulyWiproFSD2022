package fsd.week9.EdgeService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {
	
	@Autowired
	private ItemClient itemClient;
	
	
	@GetMapping("/top-brands")
	@CrossOrigin
   
	public Collection<Item> topItems()
	{
		return itemClient.readItems().getContent().stream().filter(this::isGreat).collect(Collectors.toList());
				
	}
	public boolean isGreat(Item item)
	{
		return !item.getName().equals("Nike") &&
			!item.getName().equals("Adidas") &&
			!item.getName().equals("Reebok");
	}

}
