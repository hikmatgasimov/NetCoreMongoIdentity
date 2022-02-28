package com.begin.restservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulServicesApplication.class, args);
	}
    @Bean
    public LocaleResolver localResolver() {
    	//SessionLocaleResolver localResolver=new SessionLocaleResolver();
    	AcceptHeaderLocaleResolver localResolver=new AcceptHeaderLocaleResolver ();
    	
    	localResolver.setDefaultLocale(Locale.US);
    	return localResolver;
    }
    
  /*  @Bean BECAUSE I GAVE MESSAGE FROM APPLICATION PROPERTIES
    public ResourceBundleMessageSource messageSource() {
    	 ResourceBundleMessageSource messageSource=new  ResourceBundleMessageSource();
    	 messageSource.setBasename("messages");
    	 return messageSource;
    }*/
}
