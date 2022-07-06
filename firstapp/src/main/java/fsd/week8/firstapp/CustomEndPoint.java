package fsd.week8.firstapp;
import org.springframework.boot.actuate.endpoint.*;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Endpoint(id="customendpoint")
@Component
public class CustomEndPoint {
	@ReadOperation
	@Bean
	public String greet()
	{
		return "Hello from custom endpoint";
	}

}
