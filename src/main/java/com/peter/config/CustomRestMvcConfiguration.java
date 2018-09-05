package com.peter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ImportResource({"classpath:/spring/applicationContext-*.xml"})
@EnableWebMvc
@ComponentScan(basePackages = "com.peter")
public class CustomRestMvcConfiguration {
	
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer(){
		return new RepositoryRestConfigurerAdapter(){

			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath("/api");
			}
		};
	}
	
}
