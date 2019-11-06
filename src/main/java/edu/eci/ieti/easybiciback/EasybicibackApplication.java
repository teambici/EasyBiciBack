package edu.eci.ieti.easybiciback;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import edu.eci.ieti.easybiciback.Config.JwtFilter;

@SpringBootApplication
public class EasybicibackApplication {
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
