package fsd.week8.seconddemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	@Bean
	public Docket employeeApis()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Employee-Api")
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("fsd.week8.seconddemo.controller"))
				.build();
	}
	@Bean
	public Docket demoApis()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Demo-Api")
				.select()
				.apis(RequestHandlerSelectors
						.any())
				.build();
	}

}
