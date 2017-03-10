package com.sample.userMangement;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.sample")
public class SpringUserMangementDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserMangementDemoApplication.class, args);
		
		

	}
	
	 /*  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	    }
*/
	  /*  @Bean
	    public ResourceBundleMessageSource messageSource() {
	        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
	        resourceBundleMessageSource.setBasename("i18n/message");
	        return resourceBundleMessageSource;
	    }*/

	    @Bean
	    public SessionLocaleResolver localeResolver() {
	        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
	        sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
	        return sessionLocaleResolver;
	    }
}
