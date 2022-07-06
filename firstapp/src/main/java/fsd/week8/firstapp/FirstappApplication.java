package fsd.week8.firstapp;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class FirstappApplication implements CommandLineRunner{
	
	//private static Logger LOG=LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		log.info("Application has Started");
		SpringApplication.run(FirstappApplication.class, args);
		System.out.println("My First Spring Boot Application");
		System.out.println("Dev Tool is working");
		log.warn("A warning message");
		log.info("Application has finished");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Executing: Command Line Runner");
		for(int i=0;i<args.length;i++)
		{
			log.info("args[{}]:{}",i,args[i]);
		}
		
	}
	//@Bean
	/*public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	{
		return args->{
			System.out.println("inspect the beans provided by Spring Boot:");
			
			String [] beanNames=ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames)
			{
				System.out.println(beanName);
			}
			
		};
	}*/


}
