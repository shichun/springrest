package com.peter.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class RestExporterWebInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
	   /* rootCtx.register(
//	        JpaRepositoryConfig.class, // Include JPA entities, Repositories
//	        MongoDbRepositoryConfig.class, // Include MongoDB document entities, Repositories
//	        GemfireRepositoryConfig.class // Inlucde Gemfire entities, Repositories
	    );*/
	    servletContext.addListener(new ContextLoaderListener(rootCtx));

	    AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
	    webCtx.register(CustomRestMvcConfiguration.class);

	    DispatcherServlet dispatcherServlet = new DispatcherServlet(webCtx);
	    ServletRegistration.Dynamic reg = servletContext.addServlet("rest-exporter", dispatcherServlet);
	    reg.setLoadOnStartup(1);
	    reg.addMapping("/*");
	}

}
