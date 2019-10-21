package edu.eci.ieti.easybiciback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import edu.eci.ieti.easybiciback.Config.JwtFilter;
import edu.eci.ieti.easybiciback.Config.Mongoconfig;

@SpringBootApplication
public class EasybicibackApplication{

	public static void main(String[] args)  {
		SpringApplication.run(EasybicibackApplication.class, args);
	}
	public FilterRegistrationBean jwtFilter()
	{
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( new JwtFilter() );
		registrationBean.addUrlPatterns( "/api/*" );

		return registrationBean;
	}
}
