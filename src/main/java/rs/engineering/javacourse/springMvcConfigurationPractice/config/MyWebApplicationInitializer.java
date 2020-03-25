package rs.engineering.javacourse.springMvcConfigurationPractice.config;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import rs.engineering.javacourse.springMvcConfigurationPractice.dto.User;

public class MyWebApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(MyWebContextConfig.class);
		webApplicationContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic dispatcherServlet = 
				servletContext.addServlet("mySpringDispatcherServlet", 
						new DispatcherServlet(webApplicationContext));
		dispatcherServlet.addMapping("/");
		dispatcherServlet.setLoadOnStartup(1);//podrazumevana vrednost za true
		
	}

}
